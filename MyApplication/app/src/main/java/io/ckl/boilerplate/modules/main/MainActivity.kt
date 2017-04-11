package io.ckl.boilerplate.modules.main

import android.os.Bundle

import io.ckl.boilerplate.R
import io.ckl.boilerplate.modules.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * This activity implements the View protocol.
 * The view should be passive. It only tells the presenter that events have happen and shows information that comes from the presenter.
 * Should set the presenter to null whenever onDestroy() is called
 */
class MainActivity: BaseActivity(), MainContracts.View {

    internal var presenter: MainContracts.Presenter? = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter?.onCreate()

        greetButton.setOnClickListener { presenter?.onGreetButtonPressed() }
    }

    override fun onDestroy() {
        presenter?.onDestroy()
        presenter = null
        super.onDestroy()
    }

    //region MainContracts.View

    override fun showGreeting(greeting: String) {
        greetingTextView.text = greeting
    }

    //endregion

}
