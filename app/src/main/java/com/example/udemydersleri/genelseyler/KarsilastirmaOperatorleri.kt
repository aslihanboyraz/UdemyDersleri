package com.example.udemydersleri.genelseyler

fun main() {
    val a = 38
    val b = 30

    val c = 16
    val d = 50

    println("a == b : ${a == b}")
    println("a != b : ${a != b}")

   println("a > b || c > d ${a > b || c > d}") // veya operatoru true olmasi icin sadece birinin dogru olmasi yeterlidir
   println("a > b && c > d ${a > b && c > d}") // ve operatoru  true olmasi icin her ikisinin de dogru olmasi gerekir
}

