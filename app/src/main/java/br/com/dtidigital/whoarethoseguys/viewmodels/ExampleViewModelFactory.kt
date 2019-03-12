package br.com.dtidigital.whoarethoseguys.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.dtidigital.whoarethoseguys.model.repositories.ExampleRepository

// The same repository that's needed for QuotesViewModel
// is also passed to the factory
class ExampleViewModelFactory(private val exampleRepository: ExampleRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ExampleViewModel(exampleRepository) as T
    }
}