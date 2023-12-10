package com.example.udemydersleri.Nesne_Tabanli_programlama

fun main() {
    // nesne olusturma

    val bmw = Araba("beyaz", 29, false)

    val citroen = Araba("kirmizi",300,true)

// okuma
    println("Rengi       : ${bmw.renk}")
    println("Hizi        : ${bmw.hiz}")
    println("Calisiyor mu : ${bmw.CalisiyorMu}")
     println("\n")
    println("Rengi : ${citroen.renk}")
    println("hizi : ${citroen.hiz}")
    println("calisiyor mu : ${citroen.CalisiyorMu}")
// veri atama

    bmw.renk = "siyah"
    bmw.hiz = 28
    bmw.CalisiyorMu = true

    println("\n")
    println("Rengi       : ${bmw.renk}")
    println("Hizi        : ${bmw.hiz}")
    println("Calisiyor mu : ${bmw.CalisiyorMu}")

}