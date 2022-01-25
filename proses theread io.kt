package com.dicoding.kotlin.coroutines

/*
=>proses ->mengekseskusi kumpulan thread yang di eksekusi sesua jumlah kapasitas core pada cpu contohnya adalah
multiprosesing dimana bagian tersebut menggunakan fitur dari ipc interproses comunication jadi setiap proses terlihat berjalan
bersamaan tetapi sbnrnya mengalami pergantian proses secara cepat

=>theread adalah bagian dari proses yang mengekeksekusi setiap fungsi proses biasanya 1 proses minimal 1 theread dimana
theread dapat menggunakan atau berbagi sumber daya untuk keperluan eksekusi function dari proses, theread juga dapat
berkomunikasi atau switch theread tetapi bagian ui theread tidak bisa di lakukan switch karena semua bagian theread
berkorelasi terhadap ui theread jika di block maka semua app akan terpengaruh kinerjanya jika theread tersebut di blcok

=>i/o bounds adalah sebuah algoritma operasi i/o kecepatan i/o bounds dapat dipengaruhi dari perangkat yg digunakan
jika menggunakan ssd tentu lebih cepat, i/o bounds digunakan untuk menghindari bootlacks atau kemacetan dimana i/o bounds
pada piranti i/o menggunakan prinsip wait untuk menghindari theread dalam memblock ui theread maka i/o bounds
berminfiliasi terhadap concruency methode
 */