package io.ckl.boilerplate.modules.main

import io.ckl.boilerplate.models.Greeting
import io.ckl.boilerplate.modules.base.BaseContracts

class MainContracts {

    interface Presenter: BaseContracts.Presenter {
        fun onGreetButtonPressed()
    }

    interface View: BaseContracts.View {
        fun showGreeting(greeting: String)
    }

    interface Router: BaseContracts.Router {
    }

    interface Interactor: BaseContracts.Interactor {
        fun fetchGreeting()
    }

    interface InteractorOutput {
        fun onGreetingFetched(greeting: Greeting)
    }

}
