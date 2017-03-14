package io.ckl.boilerplate.modules.main

import io.ckl.boilerplate.modules.base.BaseInterfaces

class MainInterfaces {

    interface Presenter: BaseInterfaces.Presenter {
        fun onGreetButtonPressed()
    }

    interface View: BaseInterfaces.View {
        fun showGreeting(greeting: String)
    }

}
