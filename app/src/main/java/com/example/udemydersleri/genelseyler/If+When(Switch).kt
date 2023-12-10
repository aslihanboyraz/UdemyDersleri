package com.example.udemydersleri.genelseyler

fun main() {
    val yas = 20
    val isim = " asli"
    val gun = 8
if (yas >= 20 ){
    println(" resit degilsiniz")
}
else {
println(" resitsiniz")
}
when(gun){
    1 -> println("pzrts")
    2 -> println("sali")
    3 -> println("crsmb")
    4 -> println("prsmb")
    5 -> println("cm")
  else -> println(" boyle gun yok")
}

}