package com.dicoding.kotlin.coroutines

/*
dispatcher adalah mengetahui thread mana yg akan menjalankan atau menggunakan sebuah courountine->base class

-Dispatcher.default->dispatcher dasar
launch {
    // TODO: Implement suspending lambda here
}
or
launch(Dispatcher.Default){
    // TODO: Implement suspending lambda here
}

-Dispatcher.Io->membongkar pemblokiran operasi I/O dengan menggunakan kumpulan thread pada permintaan
launch(Dispatcher.IO){
    // TODO: Implement algorithm here
}

-Dispatcher.Unconfined->menjalankan courountines pada theread yg sedang berjalan sampai mencapai titik penangguhan
setelah penangguhan
courontines akan melanjutkan thread dimana courountines dipanggil

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)//delay 1 detik
        println("Resuming in ${Thread.currentThread().name}")
    }.start()//dipanggil maka courountine akan lanjut
}
coroutine telah dimulai dari main thread, kemudian tertunda
oleh fungsi delay selama 1 detik. Setelah itu, coroutine dilanjutkan kembali pada thread DefaultExecutor.

hasil:
Starting in main
Resuming in kotlinx.coroutines.DefaultExecutor
 */

/*Builder yg digunakan untuk menentukan thread yg dibutuhkan
=>single thread context
Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan.
dengan memanfaatkan newSingleThreadContext()

fun main() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()

    hasil:
    Starting in myThread
    Resuming in myThread

    Walaupun sudah menjalankan fungsi delay, coroutine akan tetap berjalan pada myThread. karena courountine sudah dijamin
    oleh dispatcher akan berjalan sesuai thread yg ditentukan

=>Thread Pool
-memiliki kumpulan thread
-Ia akan memulai dan melanjutkan coroutine di salah satu thread yang tersedia pada kumpulan tersebut.
-Runtime akan menentukan thread mana yang tersedia dan juga menentukan bagaimana proses distribusi bebannya.
-dengan fungsi newFixedThreadPoolContext()
fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}
Pada kode di atas, kita telah menetapkan thread myPool sebanyak 3 thread. Runtime akan secara otomatis menentukan pada
thread mana coroutine akan dijalankan dan dilanjutkan. Hasil dari kode tersebut adalah:
Starting in myPool-1
Resuming in myPool-2

melanjutkan thread selanjutnya setelah 1 dari 3 thread yg ditentukan oleh runtime
}

 */
