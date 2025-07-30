package com.example.tutorial

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {
    private val _textStateFlow = MutableStateFlow("")
    val textStateFlow: StateFlow<String> = _textStateFlow.asStateFlow()

    fun onTextChange(text: String) {
        _textStateFlow.update { text }
    }
}
