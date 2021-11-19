package com.turicticapp.turisticapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListSitiosActivity : AppCompatActivity() {

    private lateinit var listSitios: ArrayList<Sitio>
    private lateinit var sitiosAdapter: SitiosAdapter
    private lateinit var sitiosRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sitios)

        sitiosRecyclerView = findViewById(R.id.sitios_recycler_view)

        listSitios = createMockSitios()
        sitiosAdapter = SitiosAdapter(listSitios)

        sitiosRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = sitiosAdapter
            setHasFixedSize(false)
        }
    }

    private fun createMockSitios(): ArrayList<Sitio> {
        /* Crear sitio uno a uno
        Desde un formulario para agregar...
        var lista: ArrayList<Sitio> = arrayListOf()
         var sitio = Sitio(
             name = "Pitalito",
             description = "Capital del Surcolombiano",
             score = "5.0"
         )
         lista.add(sitio)
         return lista*/

        return arrayListOf(
            Sitio(
                name = "Playa Spratt Bight",
                description = "La playa más turística y más reconocida de San Andrés.",
                score = "4.5 / 5.0"
            ),
            Sitio(
                name = "Bahía Cocoplum",
                description = "La playa más hermosa de San Andrés.",
                score = "4.5 / 5.0"
            ),
            Sitio(
                name = "Isla Johnny Cay",
                description = "El Parque Regional protegido gracias a su biodiversidad y belleza.",
                score = "4.5 / 5.0"
            ),
            Sitio(
                name = "Cayo Acuario",
                description = "Encuentro con la naturaleza y contacto con animales fantásticos.",
                score = "4.5 / 5.0"
            ),
            Sitio(
                name = "Mar de los siete colores",
                description = "Esquina del Caribe con gama de tonos del mar, desde un azul profundo hasta un verde aguamarina translúcido.",
                score = "4.5 / 5.0"
            ),
            Sitio(
                name = "Cueva de Morgan",
                description = "Museo Tributo a la leyenda de Morgan el Pirata.",
                score = "3.0 / 5.0"
            )
        )
    }
}