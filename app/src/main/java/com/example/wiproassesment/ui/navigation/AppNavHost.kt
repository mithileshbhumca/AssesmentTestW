package com.example.wiproassesment.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.wiproassesment.ui.products.ProductListScreen

@Composable
fun AppNavHost(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = ProductListRoute,
    ) {
       composable<ProductListRoute> {
           ProductListScreen()
       }
    }

}