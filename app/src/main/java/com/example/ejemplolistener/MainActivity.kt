package com.example.ejemplolistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var numeroClick = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b = findViewById<TextView>(R.id.button)
        b.setOnClickListener {
            numeroClick++
            Toast.makeText(this, "Botón ha sido pulsado $numeroClick veces", Toast.LENGTH_LONG).show()
        }
        Toast.makeText(this, "Botón ha sido pulsado $numeroClick veces", Toast.LENGTH_LONG).show()

        /* var objetoPadre = ClasePadre()
        objetoPadre.fun1()
        objetoPadre.fun2() */

        val objetoHijo1 = ClaseHija1()
        objetoHijo1.fun1()
        objetoHijo1.fun2()
        objetoHijo1.fun3()

        val objetoHijo2 = ClaseHija2()
        objetoHijo2.fun1()
        objetoHijo2.fun2()
        objetoHijo2.fun3()

        var listaObjetos1 = MutableList(1) {
            objetoHijo1
        }

        var listaObjetos2 = MutableList(1) {
            objetoHijo2
        }

        var listaObjetoPadre : MutableList<ClasePadre> = MutableList(1) {
            objetoHijo1
        }
        listaObjetoPadre.add(objetoHijo2)

        println(listaObjetoPadre)

        listaObjetoPadre.forEach {
            if (it is ClaseHija1) {
                it.fun4()
            }
            if (it is ClaseHija2) {
                it.fun5()
            }
        }

        val objetoInterfaz1 = ClaseImplementaInterfaz1()
        objetoInterfaz1.fun2()
        val objetoInterfaz2 = ClaseImplementaInterfaz2()
        objetoInterfaz2.fun3()

        val listaInterfaces = mutableListOf(objetoInterfaz1, objetoInterfaz2)
        listaInterfaces.forEach {
            it.fun1()
            if (it is ClaseImplementaInterfaz1) {
                it.fun2()
            }
            if (it is ClaseImplementaInterfaz2) {
                it.fun3()
            }
        }

        var guerro = Guerrero()
        var arquero = Arquero()
        var listaUnidades = mutableListOf(guerro, arquero)
        listaUnidades.forEach {
            it.avanzar()
            it.atacar()
        }

    }
}