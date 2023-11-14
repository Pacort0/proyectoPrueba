package com.example.proyectoprueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectoprueba.ui.theme.ProyectoPruebaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            addLocalContactList(itemcontacto = listOf(
                Contacto(1, "Javi", "Viejo", 123456789),
                Contacto(2, "Migue", "Cabezon", 123456789),
                Contacto(3, "Alessandro", "Leotta", 123456789),
                Contacto(4, "Lydia", "Valentín", 123456789),
                Contacto(5, "Luisa", "Gaming", 123456789),
                Contacto(6, "Antonio", "Abusen", 123456789),
                Contacto(7, "Isa", "Katharina", 123456789),
                Contacto(8, "Juan", "Melenas", 123456789),
                Contacto(9, "David", "Suéltame", 123456789),
                Contacto(10, "Yeray", "Llull", 123456789),
                Contacto(11, "Jaime", "Betis", 123456789),
                Contacto(12, "Alejandro", "Pesao", 123456789),
                Contacto(13, "Ángel", "A", 123456789),
                Contacto(14, "Matías", "Nahuel", 123456789),
                Contacto(15, "Carmen", "Teñida", 123456789),
                Contacto(16, "Pedro", "Afeitate", 123456789),
                Contacto(17, "Juanma", "GoodGame", 123456789),
                Contacto(18, "Pedro", "Conejo", 123456789),
            ))
        }
    }
}
