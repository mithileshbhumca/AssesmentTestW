package com.example.wiproassesment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.wiproassesment.ui.navigation.AppNavHost
import com.example.wiproassesment.ui.theme.MyAssesmentTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAssesmentTheme {
                val navController = rememberNavController()
                AppNavHost(navController)
            }
        }
    }
}
