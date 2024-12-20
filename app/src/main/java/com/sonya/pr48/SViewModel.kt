package com.sonya.pr48

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SViewModel:ViewModel() {
    var sharedData = mutableStateOf("")
}