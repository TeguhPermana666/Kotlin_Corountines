package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
//memulai couruntines utama
    launch {
        //Menjalankan courountines baru, dalam courountines utama dapat berisikan beberapa luchh
        delay(1000L)//delay 1 detik
        //delay adalah substencing function yg tidak memblokir thread
        println("Coroutines!")
        //selama delay main theread trs berjalan (coruntine scope) dan mencetak hello dan setelah 1 detik dari delay maka
        //dicetaklah corountines kemudian delay 2 detik untuk mengakhiri jvm pada courountines
    }
    println("Hello,")
    delay(2000L)
}

