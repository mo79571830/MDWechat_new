package com.blanke.mdwechat

import com.blanke.mdwechat.bean.ViewTreeItem

object ViewTreeRepo {
    val ConversationListViewItem: ViewTreeItem by lazy {
        ViewTreeItem(
                CC.LinearLayout.name,
                arrayOf(
                        ViewTreeItem(
                                CC.RelativeLayout.name,
                                arrayOf(
                                        ViewTreeItem(CC.ImageView.name),
                                        ViewTreeItem(CC.TextView.name),
                                        ViewTreeItem(CC.ImageView.name)
                                )
                        ),
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(Classes.NoMeasuredTextView.name)
                                                                )
                                                        ),
                                                        ViewTreeItem(Classes.NoMeasuredTextView.name)
                                                )
                                        ),
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        ViewTreeItem(Classes.NoMeasuredTextView.name)
                                                                )
                                                        ),
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        ViewTreeItem(CC.ImageView.name)
                                                                )
                                                        )

                                                )
                                        )
                                )
                        )
                )
        )
    }

    val ConversationListViewItem_7_0_11: ViewTreeItem by lazy {
        ViewTreeItem(
                CC.LinearLayout.name,
                arrayOf(
                        ViewTreeItem(
                                CC.RelativeLayout.name,
                                arrayOf(
                                        ViewTreeItem(CC.ImageView.name),
                                        ViewTreeItem(CC.TextView.name),
                                        ViewTreeItem(CC.ImageView.name)
                                )
                        ),
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(Classes.NoMeasuredTextView.name)
                                                                )
                                                        ),
                                                        ViewTreeItem(Classes.NoMeasuredTextView.name)
                                                )
                                        ),
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        ViewTreeItem(Classes.NoMeasuredTextView.name)
                                                                )
                                                        ),
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        ViewTreeItem("com.tencent.mm.ui.widget.imageview.WeImageView"),
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        ViewTreeItem(CC.ImageView.name)
                                                                )
                                                        )

                                                )
                                        )
                                )
                        )
                )
        )
    }

    val ContactListViewItem: ViewTreeItem by lazy {
        ViewTreeItem(
                Classes.NoDrawingCacheLinearLayout.name,
                arrayOf(
                        ViewTreeItem(CC.TextView.name),
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                CC.RelativeLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(CC.TextView.name),
                                                        ViewTreeItem(CC.TextView.name),
                                                        ViewTreeItem(CC.TextView.name),
                                                        ViewTreeItem("com.tencent.mm.ui.AddressView")
                                                )
                                        )
                                )
                        )
                )
        )
    }
    val ContactListViewItem_7_0_0: ViewTreeItem by lazy {
        ViewTreeItem(
                Classes.NoDrawingCacheLinearLayout.name,
                arrayOf(
                        ViewTreeItem(CC.RelativeLayout.name),
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                CC.RelativeLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(CC.TextView.name),
                                                        ViewTreeItem(CC.TextView.name),
                                                        ViewTreeItem(CC.TextView.name),
                                                        ViewTreeItem(CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem("com.tencent.mm.ui.chatting.view.AvatarImageView"),
                                                                        ViewTreeItem("com.tencent.mm.ui.AddressView")
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        )
    }

    val DiscoverViewItem: ViewTreeItem by lazy {
        ViewTreeItem(
                CC.LinearLayout.name,
                arrayOf(
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem("com.tencent.mm.ui.MMImageView"),
                                                                        ViewTreeItem(
                                                                                CC.LinearLayout.name,
                                                                                arrayOf(
                                                                                        ViewTreeItem(
                                                                                                CC.LinearLayout.name,
                                                                                                arrayOf(
                                                                                                        ViewTreeItem(CC.TextView.name),
                                                                                                        ViewTreeItem(CC.TextView.name),
                                                                                                        ViewTreeItem(CC.ImageView.name)
                                                                                                )
                                                                                        ),
                                                                                        ViewTreeItem(CC.TextView.name)
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        )
    }
    val DiscoverViewItem_7_0_0: ViewTreeItem by lazy {
        ViewTreeItem(
                CC.LinearLayout.name,
                arrayOf(
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem("com.tencent.mm.ui.MMImageView"),
                                                                        ViewTreeItem(
                                                                                CC.LinearLayout.name,
                                                                                arrayOf(
                                                                                        ViewTreeItem(
                                                                                                CC.LinearLayout.name,
                                                                                                arrayOf(
                                                                                                        ViewTreeItem(
                                                                                                                CC.LinearLayout.name,
                                                                                                                arrayOf(
                                                                                                                        ViewTreeItem(CC.TextView.name),
                                                                                                                        ViewTreeItem(CC.TextView.name),
                                                                                                                        ViewTreeItem(CC.ImageView.name)
                                                                                                                )
                                                                                                        ),
                                                                                                        ViewTreeItem(CC.TextView.name)
                                                                                                )
                                                                                        ))
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        )
    }
    val DiscoverViewItem_7_0_11: ViewTreeItem by lazy {
        ViewTreeItem(
                CC.LinearLayout.name,
                arrayOf(
                        ViewTreeItem(CC.View.name),
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(
                                                                                CC.LinearLayout.name,
                                                                                arrayOf(
                                                                                        ViewTreeItem("com.tencent.mm.ui.MMImageView"),
                                                                                        ViewTreeItem(
                                                                                                CC.LinearLayout.name,
                                                                                                arrayOf(
                                                                                                        ViewTreeItem(
                                                                                                                CC.LinearLayout.name,
                                                                                                                arrayOf(
                                                                                                                        ViewTreeItem(
                                                                                                                                CC.LinearLayout.name,
                                                                                                                                arrayOf(
                                                                                                                                        ViewTreeItem(CC.TextView.name),
                                                                                                                                        ViewTreeItem(CC.TextView.name),
                                                                                                                                        ViewTreeItem(CC.ImageView.name)
                                                                                                                                )
                                                                                                                        ),
                                                                                                                        ViewTreeItem(CC.TextView.name)
                                                                                                                )
                                                                                                        ))
                                                                                        )
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )))
    }

    val SettingAvatarView: ViewTreeItem by lazy {
        ViewTreeItem(
                CC.LinearLayout.name,
                arrayOf(
                        ViewTreeItem(
                                CC.RelativeLayout.name,
                                arrayOf(
                                        ViewTreeItem(CC.ImageView.name),
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(Classes.NoMeasuredTextView.name),
                                                        ViewTreeItem(CC.TextView.name)
                                                )
                                        ),
                                        ViewTreeItem(CC.TextView.name)
                                )
                        ),
                        ViewTreeItem(CC.ImageView.name)
                )
        )
    }
    val SettingAvatarView_7_0_0: ViewTreeItem by lazy {
        ViewTreeItem(
                CC.RelativeLayout.name,
                arrayOf(
                        ViewTreeItem(CC.ImageView.name),
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(CC.RelativeLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(CC.ImageView.name),
                                                        ViewTreeItem(CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(Classes.NoMeasuredTextView.name),
                                                                        ViewTreeItem(CC.TextView.name)
                                                                ))

                                                ))
                                )
                        )
                )
        )
    }

    val ChatRightMessageItem: ViewTreeItem by lazy {
        ViewTreeItem(
                "com.tencent.mm.ui.chatting.viewitems.",
                arrayOf(
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(CC.View.name),
                                        ViewTreeItem(CC.TextView.name),
                                        ViewTreeItem(CC.View.name)
                                )
                        ),
                        ViewTreeItem(CC.TextView.name),
                        ViewTreeItem(CC.CheckBox.name),
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(CC.View.name),
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(CC.TextView.name),
                                                        ViewTreeItem(
                                                                CC.LinearLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        ViewTreeItem(CC.ProgressBar.name),
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        // 适应 7.0.11
                                                                        null
//                                                                        before 7.0.6
//                                                                        ViewTreeItem("com.tencent.mm.ui.widget.MMNeatTextView")

//                                                                        after
//                                                                        ViewTreeItem(
//                                                                                CC.LinearLayout.name,
//                                                                                arrayOf(
//                                                                                        ViewTreeItem("com.tencent.mm.ui.widget.MMNeat7extView"),
//                                                                                        ViewTreeItem(CC.TextView.name)
//                                                                                )
//                                                                        )
                                                                )
                                                        ),
                                                        ViewTreeItem(CC.ViewStub.name)
                                                )
                                        ),
                                        ViewTreeItem(
                                                "com.tencent.mm.ui.base.MaskLayout",
                                                arrayOf(
                                                        null,
                                                        ViewTreeItem(CC.ViewStub.name),
                                                        ViewTreeItem(CC.View.name),
                                                        ViewTreeItem(CC.ImageView.name)
                                                )
                                        )
                                )
                        ),
                        ViewTreeItem(CC.View.name)
                )
        )
    }
    val ChatLeftMessageItem: ViewTreeItem by lazy {
        ViewTreeItem(
                "com.tencent.mm.ui.chatting.viewitems.",
                arrayOf(
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(CC.View.name),
                                        ViewTreeItem(CC.TextView.name),
                                        ViewTreeItem(CC.View.name)
                                )
                        ),
                        ViewTreeItem(CC.TextView.name),
                        ViewTreeItem(CC.CheckBox.name),
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                "com.tencent.mm.ui.base.MaskLayout",
                                                arrayOf(
                                                        null,
                                                        ViewTreeItem(CC.ViewStub.name),
                                                        ViewTreeItem(CC.View.name),
                                                        ViewTreeItem(CC.ImageView.name)
                                                )
                                        ),
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(CC.TextView.name),
//                                                        former
//                                                        ViewTreeItem("com.tencent.mm.ui.widget.MMNeatTextView"),
//                                                        7.0.11
//                                                        ViewTreeItem("com.tencent.mm.ui.widget.MMNeat7extView"),
                                                        null,
                                                        ViewTreeItem(
                                                                CC.RelativeLayout.name,
                                                                arrayOf(
                                                                        ViewTreeItem(CC.ImageView.name),
                                                                        ViewTreeItem(CC.TextView.name)
                                                                )
                                                        ), null
//                                                        7.0.11 新增
//                                                        android.widget.LinearLayout
//                                                                android.widget.TextView
//                                                                android.view.View
//                                                        android.view.ViewStub

//                                                        ViewTreeItem(CC.ViewStub.name)
                                                )
                                        )
                                )
                        ),
                        ViewTreeItem(CC.View.name)
                )
        )
    }
    val ChatRightAudioMessageItem: ViewTreeItem by lazy {
        ViewTreeItem(
                "com.tencent.mm.ui.chatting.viewitems.",
                arrayOf(
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(CC.View.name),
                                        ViewTreeItem(CC.TextView.name),
                                        ViewTreeItem(CC.View.name)
                                )
                        ),
                        ViewTreeItem(CC.TextView.name),
                        ViewTreeItem(CC.CheckBox.name),
                        ViewTreeItem(
                                CC.RelativeLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                "com.tencent.mm.ui.base.MaskLayout",
                                                arrayOf(
                                                        null,
                                                        ViewTreeItem(CC.ViewStub.name),
                                                        ViewTreeItem(CC.View.name),
                                                        ViewTreeItem(CC.ImageView.name)
                                                )
                                        ),
                                        ViewTreeItem(CC.TextView.name),
                                        ViewTreeItem(CC.TextView.name),
                                        ViewTreeItem(CC.TextView.name),
                                        ViewTreeItem(
                                                CC.LinearLayout.name,
                                                arrayOf(
                                                        ViewTreeItem(CC.ProgressBar.name)
                                                )
                                        )
                                )
                        ),
                        ViewTreeItem(CC.View.name)
                )
        )
    }
    val ChatLeftAudioMessageItem: ViewTreeItem by lazy {
        ViewTreeItem(
                "com.tencent.mm.ui.chatting.viewitems.",
                arrayOf(
                        ViewTreeItem(
                                CC.LinearLayout.name,
                                arrayOf(
                                        ViewTreeItem(CC.View.name),
                                        ViewTreeItem(CC.TextView.name),
                                        ViewTreeItem(CC.View.name)
                                )
                        ),
                        ViewTreeItem(CC.TextView.name),
                        ViewTreeItem(CC.CheckBox.name),
                        ViewTreeItem(
                                CC.RelativeLayout.name,
                                arrayOf(
                                        ViewTreeItem(
                                                "com.tencent.mm.ui.base.MaskLayout",
                                                arrayOf(
                                                        null,
                                                        ViewTreeItem(CC.ViewStub.name),
                                                        ViewTreeItem(CC.View.name),
                                                        ViewTreeItem(CC.ImageView.name)
                                                )
                                        ),
                                        ViewTreeItem(CC.RelativeLayout.name
                                                , arrayOf(
                                                ViewTreeItem(CC.TextView.name),
                                                ViewTreeItem(CC.TextView.name),
                                                null,
                                                null
                                        ))
                                )
                        ),
                        ViewTreeItem(CC.View.name)
                )
        )
    }
}