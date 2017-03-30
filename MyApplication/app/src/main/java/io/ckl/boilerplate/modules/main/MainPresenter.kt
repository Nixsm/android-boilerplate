package io.ckl.boilerplate.modules.main

import android.app.Activity
import io.ckl.boilerplate.api_services.GreetingAPIService
import io.ckl.boilerplate.models.Greeting

/**
 * This is a example presenter.

 * The presenter holds a instance of the View, which is a interface implementation.
 * This view should be set as null whenever the activity reaches onDestroy().

 * The presenter is responsible for the business logic, fetching models and telling the view to update.
 */
class MainPresenter(internal var view: MainContracts.View?): MainContracts.Presenter, MainContracts.InteractorOutput {
    var interactor: MainContracts.Interactor? = MainInteractor(this)
    var router: MainContracts.Router? = MainRouter(view as? Activity)

    // region MainContracts.Presenter

    override fun onCreate() {
        greet()
    }

    override fun onGreetButtonPressed() {
        greet()
    }

    override fun onDestroy() {
        this.view = null
    }

    // end region


    // region private

    private fun greet() {
        val greeting = GreetingAPIService.fetchGreeting()
        view?.showGreeting(greeting.content)
    }

    // end region
}
