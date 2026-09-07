package com.example.wiproassesment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.wiproassesment.ui.screen.PokemonScreen
import com.example.wiproassesment.ui.theme.WiproAssesmentTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WiproAssesmentTheme {
                PokemonScreen()
            }
        }
    }
}
