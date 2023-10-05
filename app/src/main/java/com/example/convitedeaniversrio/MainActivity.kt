package com.example.convitedeaniversrio

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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.convitedeaniversrio.ui.theme.ConviteDeAniversárioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConviteDeAniversárioTheme {
                ConviteDeAniversário()
                // A surface container using the 'background' color from the theme

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ConviteDeAniversário() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.aniversario),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),

            )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Feliz Aniversário",
                fontSize = 80.sp,
                color = Color.Black,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Cursive,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 220.dp)
                    .padding(bottom = 200.dp),
                lineHeight = 100.sp
            )
            Dedicatoria(text = "De: Vv")
            Dedicatoria(text = "Para: Aniversariante")
        }
    }
}

@Composable
fun Dedicatoria(text: String) {
    Text(
        text = text,
        fontSize = 40.sp,
        color = Color.Black,
        fontWeight = FontWeight.Black,
        fontFamily = FontFamily.Cursive,
        textAlign = TextAlign.End,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 12.dp),
    )


}