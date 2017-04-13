package io.ckl.boilerplate.modules.base

import android.content.Intent

interface BaseContracts {

    interface Presenter {
        fun onCreate(intent: Intent? = null)
        fun onDestroy()
    }

    interface View {
    }

    interface Interactor {
        fun unRegister()
    }

    interface Router {
        fun unRegister()
    }
}
