package com.dicoding.kotlin.coroutines

/*
starvation adalah kelaparan  ini terjadi akibat dari effect deadlock yg menyebabkan proses kekurangan sumberdaya
untuk mengakses dan mengeksekusi tiap fungsi atau perintah dari proses sehingga membuat proses berhenti karena
kehabisan timelimit akibat kekuarangan sumber daya
atau bisa juga kesalahan penjadwalan proses, solusi -> agging(priority secheduling)

race condition adalah keadaan dimana sebuah theread mengakses data secara bersamaan dan mengalami perubahan pada saat
bersamaan pada runtime hal ini dapat menyebabkan keburukan production atau hasilnya tidak sesuai ekspetasi dimana terjadinya
kesalahan debug ada code function atau object pada kelas yg tidak dibaca,
contoh
beli laptop di shope rog ada 1 pics aja trs aku klick ternyata wahyu juga klick itu rog nahh terjadi perubahan data
misal di aku lebih lama 0.001 second sehingga wahyu mendapatkan jika itu tidak ditangani dengan baik maka terjadi kesalahan
yaitu race condition

 */