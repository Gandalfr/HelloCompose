package com.kimey.jetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kimey.jetpack.compose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp{
                ComposeDocuments()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun ComposeDocuments() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_hero),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .background(color = Color.White,shape = RoundedCornerShape(4.dp))
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text("Thinking in Compose", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Text("OverView", fontSize = 10.sp)
        Text("Foundation", fontSize = 10.sp)
        Text("Development environment", fontSize = 10.sp)
        Text("Design", fontSize = 10.sp)
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    HelloComposeTheme {
        Surface(color = Color.LightGray){
            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        ComposeDocuments()
    }
}