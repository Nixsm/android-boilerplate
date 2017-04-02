package io.ckl.boilerplate.modules.base

import android.content.Intent

class BaseContracts {

    interface Presenter {
        fun onCreate(intent: Intent? = null)
        fun onDestroy()
    }

    interface View {
    }
}
