package com.example.roomdatabase_015.view.route

interface DestinasiNavigasi {
    /**
     * Nama unik utk menentukan jalur utk composable
     */
    val route: String

    /**
     * String resource id yg berisi judul yg akan ditampilkan di layar halaman
     */
    val titleRes: Int
}