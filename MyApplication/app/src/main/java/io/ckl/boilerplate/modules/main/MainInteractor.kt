package io.ckl.boilerplate.modules.main

import io.ckl.boilerplate.api_services.GreetingAPIService

/**
 * This in an example Interactor
 *
 * The Interactor is responsible for the business logic, fetching models and telling the presenter to update the view
 */
class MainInteractor(var output: MainContracts.InteractorOutput?): MainContracts.Interactor {

    // region MainContracts.Interactor

    override fun fetchGreeting() {
        val greeting = GreetingAPIService.fetchGreeting()
        output?.onGreetingFetched(greeting)
    }

    override fun unRegister() {
        output = null
    }

    // end region


}