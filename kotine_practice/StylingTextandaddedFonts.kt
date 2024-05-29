package com.example.stylingtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.stylingtext.ui.theme.StylingTExtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}
val fontFamily = FontFamily(
    Font(R.font.lexend_thin,FontWeight.Thin),
    Font(R.font.lexend_light,FontWeight.Light),
    Font(R.font.lexend_regular,FontWeight.Normal),
    Font(R.font.lexend_medium,FontWeight.Medium),
    Font(R.font.lexend_semibold,FontWeight.SemiBold),
    Font(R.font.lexend_bold,FontWeight.Bold),
    Font(R.font.lexend_extrabold,FontWeight.ExtraBold)
)
@Composable
fun TextFieldComponent() {
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF023020))) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                        style = SpanStyle(
                            color = Color.Green,
                            fontSize = 50.sp
                        )
                        ) {
                    append("J")
                }
                append("etPack ")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("C")
                }
                append("ompose")
                                        },
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTextFieldComponent() {
    TextFieldComponent()
}







