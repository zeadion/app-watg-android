package br.com.dtidigital.whoarethoseguys.viewmodels

import androidx.lifecycle.ViewModel
import br.com.dtidigital.whoarethoseguys.model.entities.ExampleEntity
import br.com.dtidigital.whoarethoseguys.model.repositories.ExampleRepository

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection
class ExampleViewModel(private val exampleRepository: ExampleRepository)
    : ViewModel() {

    fun getExampleEntities() = exampleRepository.getExampleentities()

    fun addExampleEntity(exampleEntity: ExampleEntity) = exampleRepository.addExampleEntity(exampleEntity)
}