package io.ckl.boilerplate.modules.base

class BaseContracts {

    interface Presenter {
        fun onCreate()
        fun onDestroy()
    }

    interface View {
    }
}
