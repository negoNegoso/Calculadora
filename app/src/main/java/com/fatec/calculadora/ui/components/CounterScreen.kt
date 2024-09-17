package com.fatec.calculadora.ui.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen() {
    /*
    * CRIE UMA CALCULORA QUE ACEITE DOIS INPUTS DE DADOS DO TIPO DOUBLE
    *   TER AS 4 OPERACOES BASICAS: +, -, * E /
    */
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center, // Alinha verticalmente ao centro
        horizontalAlignment = Alignment.CenterHorizontally // Alinha horizontalmente ao centro
    ) {
        var count by rememberSaveable { mutableIntStateOf(0) }
        Counter(count, onIncrement = { count++ })
    }
}

@Composable
fun Counter(count: Int, onIncrement: () -> Unit) {
    Button(onClick = onIncrement) {
        Text("Count: $count")
    }
}