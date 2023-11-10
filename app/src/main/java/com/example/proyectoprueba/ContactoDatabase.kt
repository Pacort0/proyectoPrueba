package com.example.proyectoprueba

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Contacto::class), version = 1)
abstract class ContactoDatabase:RoomDatabase() {
    abstract val dao:ContactoDao
}