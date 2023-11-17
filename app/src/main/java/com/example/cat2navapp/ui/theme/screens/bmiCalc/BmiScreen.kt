package com.example.cat2navapp.ui.theme.screens.bmiCalc

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cat2navapp.ui.theme.Cat2NavAppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BmiScreen(navController: NavHostController) {
    var weight by remember { mutableStateOf("0") }
    var height by remember { mutableStateOf("0") }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "BMI Calculator")
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = weight,
            onValueChange = { weight = it },
            label = { Text(text = "Weight (kg)") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = height,
            onValueChange = { height = it },
            label = { Text(text = "Height (cm)") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
    }
    Spacer(modifier = Modifier.height(16.dp))

    val bmi = calculateBmi(weight.toFloatOrNull() ?: 0f, height.toFloatOrNull() ?: 0f)
    val bmiCategory = when {
        bmi < 18.5 -> "Underweight"
        bmi < 25 -> "Normal weight"
        else -> "Overweight"
    }

    if (bmi > 0f) {
        Text(text = "Your BMI: $bmi")
        OutlinedBmiText(category = bmiCategory)
    }
}


@Composable
fun OutlinedBmiText(category: String) {
    Text(
        text = category,
        modifier = Modifier
            .padding(8.dp)
            .border(
                border = BorderStroke(1.dp, Color.Black),
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}

fun calculateBmi(weight: Float, height: Float): Float {
    val heightInMeter = height / 100
    return weight / (heightInMeter * heightInMeter)
}

@Preview(showBackground = true)
@Composable
fun BmiScreenPreview() {
    Cat2NavAppTheme {
        BmiScreen(rememberNavController())
    }
}









