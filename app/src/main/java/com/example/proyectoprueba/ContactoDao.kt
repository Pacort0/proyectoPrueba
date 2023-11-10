package com.example.proyectoprueba

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ContactoDao {
    @Query("SELECT * FROM contactos")
    suspend fun getAllContacts():MutableList<Contacto>
    @Query("SELECT * FROM contactos WHERE id = :id")
    suspend fun findById (id: Int): Contacto
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertContact(contacto: Contacto)
    @Delete
    suspend fun deleteContact(contacto: Contacto)
}