package com.example.ejemplolistener

abstract class Unidad {

    fun avanzar() {
        println("La unidad avanza un punto")
    }

    abstract fun atacar()
}