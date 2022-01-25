package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

//courontines builder ini terdiri dari adalah mengambil suspending lambda dan membiarkan scope tersebut
// dijalankan oleh corountines
/*
=>lauch
fungsi ini tidak akan mengembalikan hasil sama sekali lauch akan menghasilkan job yg digunakan untuk membatalkan
eksekusi

=>runblocking
fungsi ini menjembatani blocking code yg dpt ditangguhkan run blocking akan memblocking thread yg sedang berjalan
sehingga courountines selesai
bisa di terapkan pada main atau unit test

=>async
fungsi ini akan membuat courountines baru yg akan membalikan hasil kebalikan dari lauch
fungsi ini akan menangkap segala exception yg terjadi di dalam courountines
fungsi ini akan membalikan deferred yg berisi hasil atau exception
 */

fun main()= runBlocking {
    //tanpa ascy
    val masuk = getIncome()
    val keluar= setIncome()
    println("Keuntungan Anda adalah ${masuk-keluar}")
    //dengan asyc
    val asyc_masuk = async{ getIncome()}
    val ayc_keluar = async{ setIncome()}
    println("Keuntungan Anda adalah ${asyc_masuk.await()-ayc_keluar.await()}")
    //await adalah syntacx untuk mengakses sebuah nilai balik dari async atau mengakses defered-nya

    //bandingkan waktu asyc dengan tanpa asyc
    val frist_time= measureTimeMillis{
        val masuk2= getIncome()
        val keluar2 = setIncome()
        println("Keuntungan Anda adalah ${masuk2-keluar2}")
    }
    val second_time= measureTimeMillis {
        val asyc_masuk2=async{ getIncome()}
        val asyc_keluar2=async{ setIncome()}
        println("Keuntungan Anda adalah ${asyc_masuk2.await()-asyc_keluar2.await()}")
    }
    println("Waktu completed $frist_time vs $second_time")
}
suspend fun getIncome():Int{
    delay(1000L)
    return 75000
}
suspend fun setIncome():Int{
    delay(1000L)
    return 50000
}