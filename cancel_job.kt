package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
        val job = launch {
            delay(5000)
            println("Start new job!")
        }
        delay(2000)
        job.cancel()
        println("Cancelling job...")
        if (job.isCancelled){
            println("Job is cancelled")
        }
    }
