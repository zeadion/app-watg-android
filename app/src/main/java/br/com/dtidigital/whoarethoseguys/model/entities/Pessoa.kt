package br.com.dtidigital.whoarethoseguys.model.entities

import java.util.*

data class Pessoa (val codPessoa: Int,
                   val codTribo : Int,
                   val nome : String,
                   val email : String,
                   val funcao : String,
                   val dataAniversario : Date?){
}