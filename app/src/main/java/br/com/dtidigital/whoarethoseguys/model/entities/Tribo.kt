package br.com.dtidigital.whoarethoseguys.model.entities

data class Tribo(val codTribo: Int,
                 val codTriboPai: Int,
                 val nomeTribo: String,
                 val crossFuncional: Boolean,
                 val urlLogotipo: String) {
}