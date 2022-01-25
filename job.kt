package coroutines

import kotlinx.coroutines.*


/*
Job =>sebuah hasil dari perintah asychronous yg dijalankan , object dari job akan merepresentasikan courountine yg
sebenarnya
-is active=>sebuah properti yg menunjukan bahwa sebuah job sedang dijalankan
-is complete=>sebuah properti yg menunjukan bahwa sebuah job sudah dijalankan
-is canceled=>sebuah properti yg menunjukan bahwa sebuah job dibatalkan
 */

fun main(){
    //membuat job baru=>launch,job

    /*Inisialisasi
    //menggunakan launch():
    fun main() = runBlocking {
        val job = launch {
            // Do background task here
        }
    }

    //menggunakan Job():
    fun main() = runBlocking {
        val job = Job()
    }
     */

    /*
    Menginisialisasikan job tanpa digunakan
    fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        TODO("Not implemented yet!")
    }
}
     */

    //Menjalankan job
    fun main()=runBlocking{
        val job=launch(start=CoroutineStart.LAZY){
            delay(1000)
            println("IN JOB")
        }
        //memanggil start job dengan start
        println("Start:")
        job.start()
        println("Other run")
        //memanggil start job dengan join
        println("JOIN:")
        job.join()
        println("From Join")

        //Perbedaannya Liat Hasil
    }
}