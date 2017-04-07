package io.ckl.boilerplate.modules.main

import android.app.Activity

/**
 * This in an example Router
 *
 * The router is responsible for handling transitions between activities
 */
class MainRouter(var activity: Activity?): MainContracts.Router {
    // region MainContracts.Router

    override fun unRegister() {
        activity = null
    }

    // end region

}