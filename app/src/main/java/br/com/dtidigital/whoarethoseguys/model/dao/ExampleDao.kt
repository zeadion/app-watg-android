package br.com.dtidigital.whoarethoseguys.model.dao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.com.dtidigital.whoarethoseguys.model.entities.ExampleEntity

class ExampleDao {
    // A fake database table
    private val exampleList = mutableListOf<ExampleEntity>()
    // MutableLiveData is from the Architecture Components Library
    // LiveData can be observed for changes
    private val exampleEntities = MutableLiveData<List<ExampleEntity>>()

    init {
        // Immediately connect the now empty quoteList
        // to the MutableLiveData which can be observed
        exampleEntities.value = exampleList
    }

    fun addEntity(entity: ExampleEntity) {
        exampleList.add(entity)
        // After adding a quote to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        exampleEntities.value = exampleList
    }

    // Casting MutableLiveData to LiveData because its value
    // shouldn't be changed from other classes
    fun getExampleEntities() = exampleEntities as LiveData<List<ExampleEntity>>
}