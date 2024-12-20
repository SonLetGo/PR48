package com.sonya.pr48

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val navController = rememberNavController()
            val sViewModel: SViewModel = viewModel()

            NavHost(navController, startDestination = "first") {
                composable("first") { FirstScreen(navController, sViewModel) }
                composable("second") { SecondScreen(sViewModel) }
            }

        }
    }
}



