package br.com.dtidigital.whoarethoseguys.model.entities

import androidx.annotation.IntRange
import java.util.*

data class PessoaSkill (val codPessoaSkill : Int,
                        val codPessoa : Int,
                        val codSkill : Int,
                        val dataAdicao : Date,
                        @IntRange(from=0, to=10) val nivelConhecimento : Int)
{
}