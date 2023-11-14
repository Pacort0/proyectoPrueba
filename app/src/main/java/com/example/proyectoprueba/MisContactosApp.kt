package com.example.proyectoprueba

import android.app.Application
import androidx.room.Room

class MisContactosApp: Application(){
    companion object{
        lateinit var database: ContactoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, ContactoDatabase::class.java, "contactos-db").build()
    }
}