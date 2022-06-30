package com.example.basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiccompose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(Message("Any", "builder"))
                }
            }
        }
    }
}
data class Message(val title: String, val body: String)
@Composable
fun Greeting(msg: Message) {
    Column {
        Text(text = "Hello ${msg.title}!")
        Text(text =  msg.body)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicComposeTheme {
        Greeting(msg = Message("Derlys", "Corpao"))
    }
}