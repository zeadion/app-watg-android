package br.com.dtidigital.whoarethoseguys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import br.com.dtidigital.whoarethoseguys.model.entities.ExampleEntity
import br.com.dtidigital.whoarethoseguys.utils.InjectorUtils
import br.com.dtidigital.whoarethoseguys.viewmodels.ExampleViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Entity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeUi()
    }

    private fun initializeUi() {
        // Get the QuotesViewModelFactory with all of it's dependencies constructed
        val factory = InjectorUtils.provideExampleViewModelFactory()
        // Use ViewModelProviders class to create / get already created QuotesViewModel
        // for this view (activity)
        val viewModel = ViewModelProviders.of(this, factory)
                .get(ExampleViewModel::class.java)

        // Observing LiveData from the QuotesViewModel which in turn observes
        // LiveData from the repository, which observes LiveData from the DAO ☺
        viewModel.getExampleEntities().observe(this,  androidx.lifecycle.Observer {exampleEntities ->
            val stringBuilder = StringBuilder()
            exampleEntities.forEach { exampleEntity ->
                stringBuilder.append("$exampleEntity\n\n")
            }
            textView_quotes.text = stringBuilder.toString()
        })

        // When button is clicked, instantiate a Quote and add it to DB through the ViewModel
        button_add_quote.setOnClickListener {
            val entity = ExampleEntity(editText_quote.text.toString(), editText_author.text.toString())
            viewModel.addExampleEntity(entity)
            editText_quote.setText("")
            editText_author.setText("")
        }
    }

}
