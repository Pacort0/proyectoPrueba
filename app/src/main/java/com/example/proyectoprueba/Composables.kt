package com.example.proyectoprueba

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import kotlinx.coroutines.runBlocking

@Composable
fun Contactos (){
    val contactos: MutableList<Contacto> = runBlocking {
        MisContactosApp.database.dao.getAllContacts()
    }
    LazyColumn{
        items(1){
            for (contacto in contactos){
                Card {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.fotocontacto),
                                contentDescription = "Foto de contacto"
                            )
                            Text(text = contacto.firstName + contacto.lastName)
                            Text(text = contacto.phone.toString())
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun addLocalContactList(itemcontacto: List<Contacto>){ runBlocking {
        for (contacto in itemcontacto){
            MisContactosApp.database.dao.insertContact(contacto)
        }
    }
}