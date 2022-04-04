package com.example.ejemplolistener

class ClaseHija2 : ClasePadre() {

    override fun fun2() {
        super.fun2()
        println("Llamándose a la fun2 del hijo2")
    }

    override fun fun3() {
        println("Soy la clase hija 2 jejejeje")
        println("Llamándose a la fun3 del hijo2")
    }

    fun fun5() {
        println("Llamándose a la fun5 del hijo2")
    }
}