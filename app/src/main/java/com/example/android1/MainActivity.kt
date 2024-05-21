package com.example.android1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android1.ui.theme.Android1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Morning()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Morning(){


    Column(
        modifier = Modifier

            .padding(4.dp)
            .background(Color.Cyan)
            .fillMaxWidth()
            // .fillMaxSize()
            .fillMaxHeight()
    ) {
        Text(text = "Welcome To Meme Lord",
            fontSize = 15.sp,
            color = Color.Red,
            fontWeight = FontWeight.ExtraBold
        )

       Spacer(modifier = Modifier
           .height(19.dp)
       )

        Text("Memes",

            fontSize = 9.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic
            )

    }






}



