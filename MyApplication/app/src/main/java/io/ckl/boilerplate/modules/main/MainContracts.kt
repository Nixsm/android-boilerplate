package io.ckl.boilerplate.modules.main

import io.ckl.boilerplate.modules.base.BaseContracts

class MainContracts {

    interface Presenter: BaseContracts.Presenter {
        fun onGreetButtonPressed()
    }

    interface View: BaseContracts.View {
        fun showGreeting(greeting: String)
    }

    interface Router {
    }

    interface Interactor {
    }

    interface InteractorOutput {
    }

}
