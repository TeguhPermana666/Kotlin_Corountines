package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncomee() }
    println("Your profit is ${income.await() - capital.await()}")
}
suspend fun getCapital():Int{
    delay(100)
    return 7000
}
suspend fun getIncomee():Int{
    delay(200)
    return 5000
}
/*
capital dan income adalah contoh dari nilai deferred yang untuk mengaksesnya kita membutuhkan fungsi await.
 */