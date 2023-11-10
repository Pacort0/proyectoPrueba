package com.example.proyectoprueba

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contactos")
data class Contacto(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val firstName:String = "",
    val lastName:String = "",
    val phone:Long = 0
)
