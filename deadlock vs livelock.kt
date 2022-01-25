package com.dicoding.kotlin.coroutines

/*
=>deadlock adalah kondisi dimana 2 atau lebih proses saling menunggu untuk  melepaskan sumberdaya
 yang digunakan terhadap satu proses sehingga proses yg berjalan tidak lese lese sehingga satu proses terpaksa di
 intterupt, contoh pada kemacetan mobil di jembatan dimana mobil adalah proses dan jembatan adalah resource

 =>livelock adalah kondisi 2 atau lebi proses bertabrakan pada satu keadaan, untuk melewatkannya setiap proses yg
 bertaprakan akan merubah rutenya hal ini menyebabkan proses berubah keadaan atau rutenya
 contoh adalah ketika jalan di terotoar ada 2 orng jalan trs ea ea ea dan akhirnya ketemu keadaan dia los saya los dan jalan deh
 kejadian tersebut (ea) bisa terjadi berulang kali sampai waktu tertentu jadi bener bener menghambat jalannya proses
 jika jalan maka merubah keadaannya atau rutenya

 */