package br.com.dtidigital.whoarethoseguys.model.entities

data class ExampleEntity(val quoteText: String,
                         val author: String) {

    override fun toString(): String {
        return "$quoteText - $author"
    }
}