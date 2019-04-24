package br.com.dtidigital.whoarethoseguys.utils

import br.com.dtidigital.whoarethoseguys.model.databases.ExampleDatabase
import br.com.dtidigital.whoarethoseguys.model.repositories.ExampleRepository
import br.com.dtidigital.whoarethoseguys.viewmodels.ExampleViewModelFactory

// Finally a singleton which doesn't need anything passed to the constructor
object InjectorUtils {

    // This will be called from QuotesActivity
    fun provideExampleViewModelFactory(): ExampleViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val exampleRepository = ExampleRepository.getInstance(ExampleDatabase.getInstance().quoteDao)
        return ExampleViewModelFactory(exampleRepository)
    }
}