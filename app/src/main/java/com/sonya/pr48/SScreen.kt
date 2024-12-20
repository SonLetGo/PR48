package com.sonya.pr48

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SecondScreen(viewModel: SViewModel) {
    val data by remember { viewModel.sharedData }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Полученные данные:")
        Spacer(modifier = Modifier.height(8.dp))
        Text(data)
    }
}