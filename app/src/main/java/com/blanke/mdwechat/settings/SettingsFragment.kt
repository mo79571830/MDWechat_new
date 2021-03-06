package com.blanke.mdwechat.settings

import android.content.ComponentName
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import android.widget.Toast
import com.blanke.mdwechat.Common
import com.blanke.mdwechat.R
import com.blanke.mdwechat.util.FileUtils
import java.io.File

/**
 * Created by blanke on 2017/6/8.
 */

class SettingsFragment : PreferenceFragment(), Preference.OnPreferenceChangeListener, Preference.OnPreferenceClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        preferenceManager.setSharedPreferencesMode(Context.MODE_WORLD_READABLE)
        preferenceManager.setSharedPreferencesName(Common.MOD_PREFS)
        addPreferencesFromResource(R.xml.pref_settings)

        findPreference(getString(R.string.key_hide_launcher_icon)).onPreferenceChangeListener = this
        findPreference(getString(R.string.key_donate)).onPreferenceClickListener = this
        findPreference(getString(R.string.key_feedback)).onPreferenceClickListener = this
        findPreference(getString(R.string.key_reset_wechat_config)).onPreferenceClickListener = this
        findPreference(getString(R.string.key_reset_view_config)).onPreferenceClickListener = this
        findPreference(getString(R.string.key_reset_icon_config)).onPreferenceClickListener = this
        findPreference(getString(R.string.key_feedback_email)).onPreferenceClickListener = this
        findPreference(getString(R.string.key_github)).onPreferenceClickListener = this
    }

    override fun onPreferenceChange(preference: Preference, o: Any): Boolean {
        when (preference.key) {
            getString(R.string.key_hide_launcher_icon) -> showHideLauncherIcon(!(o as Boolean))
        }
        return true
    }

    override fun onPreferenceClick(preference: Preference): Boolean {
        when (preference.key) {
            getString(R.string.key_donate) -> donate()
            getString(R.string.key_feedback) -> feedback()
            getString(R.string.key_reset_wechat_config) -> copyWechatConfig()
            getString(R.string.key_reset_view_config) -> copyViewConfig()
            getString(R.string.key_reset_icon_config) -> copyIcons()
            "key_feedback_email" -> sendEmail()
            "key_github" -> gotoGithub()
        }
        return true
    }

    private fun copyWechatConfig() {
        Thread {
            kotlin.run {
                FileUtils.copyAssets(activity, Common.APP_DIR_PATH, Common.CONFIG_WECHAT_DIR, true)
            }
        }.start()
        Toast.makeText(activity, R.string.msg_reset_ok, Toast.LENGTH_SHORT).show()
    }

    private fun copyViewConfig() {
        Thread {
            kotlin.run {
                FileUtils.copyAssets(activity, Common.APP_DIR_PATH, Common.CONFIG_VIEW_DIR, true)
            }
        }.start()
        Toast.makeText(activity, R.string.msg_reset_ok, Toast.LENGTH_SHORT).show()
    }

    private fun copyIcons() {
        Thread {
            kotlin.run {
                FileUtils.copyAssets(activity, Common.APP_DIR_PATH, Common.ICON_DIR, true)
                val nomediaFile = File(Common.APP_DIR_PATH + Common.ICON_DIR + File.separator + ".nomedia")
                if (!nomediaFile.exists()) {
                    nomediaFile.createNewFile()
                }
            }
        }.start()
        Toast.makeText(activity, R.string.msg_reset_ok, Toast.LENGTH_SHORT).show()
    }

    private fun showHideLauncherIcon(show: Boolean) {
        val p = activity.packageManager
        val componentName = ComponentName(activity, Common.MY_APPLICATION_PACKAGE + ".SettingsLauncher")
        p.setComponentEnabledSetting(componentName,
                if (show) PackageManager.COMPONENT_ENABLED_STATE_ENABLED else PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP)
    }

    private fun donate() {
        val intent = Intent()
        intent.action = "android.intent.action.VIEW"
        val payUrl = "HTTPS://QR.ALIPAY.COM/FKX02968MD7TU2OGNMIW5D"
        intent.data = Uri.parse("alipayqr://platformapi/startapp?saId=10000007&clientVersion=3.7.0.0718&qrcode=" + payUrl)
        if (intent.resolveActivity(activity.packageManager) != null) {
            startActivity(intent)
            return
        }
        intent.data = Uri.parse(payUrl.toLowerCase())
        startActivity(intent)
    }

    private fun feedback() {
        try {
            val str = "market://details?id=" + Common.MY_APPLICATION_PACKAGE
            val intent = Intent("android.intent.action.VIEW")
            intent.data = Uri.parse(str)
            intent.`package` = "com.coolapk.market"
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        } catch (e: Exception) {
            startActivity(Intent("android.intent.action.VIEW",
                    Uri.parse("http://www.coolapk.com/apk/" + Common.MY_APPLICATION_PACKAGE)))
        }
    }

    private fun sendEmail() {
        try {
            val info = "mailto:blanke.master+mdwechat@gmail.com?subject=[MDWechat] ????????????????????????" +
                    "&body=????????????????????????,??????????????????????????????????????????,??????!%0d%0a[????????????] ??????????????????????????????%0d%0a[??????]????????????????????? ?????? rom xp ??????%0d%0a[??????]???????????????"
            val uri = Uri.parse(info)
            startActivity(Intent(Intent.ACTION_SENDTO, uri))
        } catch (e: Exception) {

        }
    }

    private fun gotoGithub() {
        val uri = Uri.parse("https://github.com/Blankeer/MDWechat")
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }


    private val weChatVersion: String
        get() = "unKnow"

    private val isSupportWechat: Boolean
        get() = false

}