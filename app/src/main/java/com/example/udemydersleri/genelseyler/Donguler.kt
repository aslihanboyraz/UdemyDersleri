package com.example.udemydersleri.genelseyler

fun main() {
    for (i in (5 downTo 2) step 1) {
        println("$i\n")
    }
var sayac = 1

    while (sayac < 5){
        println("$sayac")
        sayac++
    }
    println("" +
            "" +
            "" +
            "" +
            "")
for (a in 1..4){

    if (a == 3){
        break
    }
    println("$a")

}

    for (a in 1..4){

        if (a == 3){
            continue
        }
        println("$a")

    }
}