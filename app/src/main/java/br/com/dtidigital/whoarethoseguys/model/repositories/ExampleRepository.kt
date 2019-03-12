package br.com.dtidigital.whoarethoseguys.model.repositories

import br.com.dtidigital.whoarethoseguys.model.dao.ExampleDao
import br.com.dtidigital.whoarethoseguys.model.entities.ExampleEntity

// FakeQuoteDao must be passed in - it is a dependency
// You could also instantiate the DAO right inside the class without all the fuss, right?
// No. This would break testability - you need to be able to pass a mock version of a DAO
// to the repository (e.g. one that upon calling getQuotes() returns a dummy list of quotes for testing)
// This is the core idea behind DEPENDENCY INJECTION - making things completely modular and independent.
class ExampleRepository private constructor(private val exampleDao: ExampleDao) {

    // This may seem redundant.
    // Imagine a code which also updates and checks the backend.
    fun addExampleEntity(exampleEntity: ExampleEntity) {
        exampleDao.addEntity(exampleEntity)
    }

    fun getExampleentities() = exampleDao.getExampleEntities()

    companion object {
        // Singleton instantiation you already know and love
        @Volatile private var instance: ExampleRepository? = null

        fun getInstance(exampleDao: ExampleDao) =
                instance ?: synchronized(this) {
                    instance ?: ExampleRepository(exampleDao).also { instance = it }
                }
    }
}