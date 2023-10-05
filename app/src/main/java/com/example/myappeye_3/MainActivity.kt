package com.example.myappeye_3

import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myappeye_3.ui.theme.MyAppEye3Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppEye3Theme {
                MyAppEye3()

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyAppEye3() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.imagemdecima),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(50.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Jetpack Compose tutorial",
                fontSize = 24.sp,
                color = Color.Black,
                fontWeight = FontWeight.Light,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Default,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(top = 70.dp)
            )
            Text(
                text = "Jetpack Compose is a modern toolkit" +
                        " for building native Android UI. " +
                        "Compose simplifies and accelerates " +
                        "UI development on Android with less code," +
                        " powerful tools, and intuitive Kotlin APIs.",
                color = Color.Black,
                fontWeight = FontWeight.Light,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Default,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(top = 16.dp)
            )
            Text(
                text = "In this tutorial, you build a simple UI component " +
                        "with declarative functions. You call Compose " +
                        "functions to say what elements you want and the " +
                        "Compose compiler does the rest. Compose is built " +
                        "around Composable functions. These functions let " +
                        "you define your app\'s UI programmatically because they " +
                        "let you describe how it should look and provide data " +
                        "dependencies, rather than focus on the process of the " +
                        "UI\'s construction, such as initializing an element and " +
                        "then attaching it to a parent. To create a Composable " +
                        "function, you add the @Composable annotation to the function " +
                        "name.",
                color = Color.Black,
                fontWeight = FontWeight.Light,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Default,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(top = 16.dp)
            )
        }
    }
}
