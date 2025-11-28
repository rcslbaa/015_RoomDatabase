package com.example.roomdatabase_015.repositori

import com.example.roomdatabase_015.room.Siswa
import com.example.roomdatabase_015.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

