package com.alreylz.android101

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.alreylz.android101.ui.theme.Android101Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android101Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    BthdayCard("Carles Calatayud Trescolí", 27, message = "Keep it up bro");
                }

            }

        }
    }
}



@Composable
fun BthdayCard(
    name: String,
    age: Int,
    modifier: Modifier = Modifier,
    message: String = "Hope you'll have an amazing day",
    from: String = "Unknown "

    ) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "${name} ",
            color = Color.Gray,
            fontSize = TextUnit(40f, TextUnitType.Sp), // fontSize = 12.sp
            textAlign = TextAlign.Center,
            lineHeight = 1.em,
            modifier = Modifier
                .padding(12.dp)
                .background(color = Color.Cyan)
        )
        Text("Happy ${age} birthday ", modifier = Modifier.padding(12.dp))
        Text("${message} ", textAlign = TextAlign.Center, modifier = Modifier.padding(12.dp))
        Text("${from} ", textAlign = TextAlign.Right, modifier = Modifier.padding(12.dp).align(alignment = Alignment.End))
    }
}


// font sizes: Sp (scaled pixels) vs Em (wont resize because it is relative to its container)


@Composable
fun LayoutExample(textContent: String = "Ejemplo") {
    Row {
        Text(textContent + "C1")
        Text(textContent + "C2")
        Text(textContent + "C3")
    }
}

//@Composable
//fun LayoutExample(textContent : String = "Ejemplo"){
//    Column{
//        Text(textContent+"R1")
//        Text(textContent+"R2")
//        Text(textContent+"R3")
//    }
//}


@Preview(
    showBackground = true,
    name = "alreylz-Preview"
)
@Composable
fun ShowCodePreview() {
    Android101Theme {

        BthdayCard(
            "Carles Calatayud Trescolí",
            27,
            message = "Keep it up bro"
        );
//        Greeting("Lots of love")
    }
}