package br.com.dtidigital.whoarethoseguys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.dtidigital.whoarethoseguys.adapter.RecycleViewAdapter
import br.com.dtidigital.whoarethoseguys.model.entities.Tribo
import kotlinx.android.synthetic.main.activity_main_host.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_host)

        val recyclerView = recyclerViewTribo

        recyclerView.adapter = RecycleViewAdapter(tribos(), this)

        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager

    }

    private fun tribos() : List<Tribo>{
        return listOf(
                Tribo(  1,
                        0,
                        "Balboa",
                        false,
                        "" ),
                Tribo(  2,
                        0,
                        "Camaleões",
                        false,
                        "" ),
                Tribo(  3,
                        0,
                        "Coringas",
                        false,
                        "" ),
                Tribo(  4,
                        0,
                        "Dalminions",
                        false,
                        "" ),
                Tribo(  5,
                        0,
                        "Formigas",
                        false,
                        "" ),
                Tribo(  6,
                        0,
                        "GC",
                        false,
                        "" ),
                Tribo(  7,
                        0,
                        "Javalis",
                        false,
                        "" ),
                Tribo(  8,
                        0,
                        "Origami",
                        false,
                        "" ),
                Tribo(  9,
                        0,
                        "Rackers",
                        false,
                        "" ),
                Tribo(  10,
                        0,
                        "Rubix",
                        false,
                        "" ),
                Tribo(  11,
                        0,
                        "Triforce",
                        false,
                        "" ),
                Tribo(  12,
                        0,
                        "Unicórnios",
                        false,
                        "" )
        )
    }
}
