package io.ckl.boilerplate.modules.main

import android.app.Activity
import android.content.Intent
import io.ckl.boilerplate.models.Greeting

/**
 * This is a example presenter.

 * The presenter holds a instance of the View, the Interactor and the Router, which are all interfaces implementations.
 * Those should be set as null whenever the activity reaches onDestroy().

 * The presenter is responsible for querying the Interactor for Data and telling the view to update.
 */
class MainPresenter(internal var view: MainContracts.View?): MainContracts.Presenter, MainContracts.InteractorOutput {
    var interactor: MainContracts.Interactor? = MainInteractor(this)
    var router: MainContracts.Router? = MainRouter(view as? Activity)

    // region MainContracts.Presenter

    override fun onCreate(intent: Intent?) {
        interactor?.fetchGreeting()
    }

    override fun onGreetButtonPressed() {
        interactor?.fetchGreeting()
    }

    override fun onDestroy() {
        interactor?.unRegister()
        router?.unRegister()
        view = null
        interactor = null
        router = null
    }

    // end region


    // region MainContracts.InteractorOutput

    override fun onGreetingFetched(greeting: Greeting) {
        view?.showGreeting(greeting.content)
    }

    // end region
}
