package com.beast.adblock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Text("THE BEAST", color = Color.Red, style = MaterialTheme.typography.displayMedium)
                    Text("V.6.6.6.6 // DATA SAVER ACTIVE", color = Color.Gray)
                    
                    Spacer(modifier = Modifier.height(40.dp))
                    
                    // Stats Section
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Column {
                            Text("1,346", color = Color.Red, style = MaterialTheme.typography.headlineLarge)
                            Text("ADS KILLED", color = Color.Gray)
                        }
                        Column {
                            Text("450 MB", color = Color.Red, style = MaterialTheme.typography.headlineLarge)
                            Text("DATA SAVED", color = Color.Gray)
                        }
                    }

                    Spacer(modifier = Modifier.height(40.dp))
                    
                    // Timer Section
                    Text("HUNTING TIMER (MINUTES)", color = Color.White)
                    var timerValue by remember { mutableStateOf(60f) }
                    Slider(value = timerValue, onValueChange = { timerValue = it }, valueRange = 0f..480f, colors = SliderDefaults.colors(thumbColor = Color.Red, activeTrackColor = Color.Red))
                    
                    Spacer(modifier = Modifier.weight(1f))
                    
                    Button(
                        onClick = { /* Start Service */ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                        modifier = Modifier.fillMaxWidth().height(60.dp)
                    ) {
                        Text("UNLEASH THE BEAST", color = Color.Black)
                    }
                }
            }
        }
    }
}
