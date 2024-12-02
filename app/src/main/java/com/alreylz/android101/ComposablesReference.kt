package com.alreylz.android101

import android.os.Bundle
import android.service.controls.Control
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.window.Dialog
// Resources
import com.alreylz.android101.R.drawable.androidparty
import com.alreylz.android101.R.drawable.thispersondoesnotexist
import com.alreylz.android101.ui.theme.Android101Theme

class ComposablesReference : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android101Theme {

            }
        }

    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewAllComposables() {
    Android101Theme {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        ) {
            Text("All the @Composables I encounter")

//            myDialog()
        }
    }
}



@Preview
@Composable
private fun PreviewMe(){
 /*
 Snippet to preview elements in any given component file
  */
}



@Composable
fun myDialog(){
    //Represents a modal and can be used to ask for extra information.
    // It is visible while it is present in the hierarchy.
    Dialog(onDismissRequest = { println("Dismissed") }) {

        Box(
            Modifier
                .background(Color.White)
                .padding(6.dp)
        ) {
            Column() {

                //Header
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray),
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "Dialog title",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
                    Button(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.Close,
                            contentDescription = "Close icon",
                            modifier = Modifier
                        )
                    }
                }

                //Actual content

                Text("Content", textAlign = TextAlign.Center)

                Row {
                    Button(onClick = {}) {
                        Text("Secondary action")
                    }
                    Button(onClick = { println("Clicked button") }) {
                        Text("PrimaryAction", textAlign = TextAlign.Center)
                    }

                }
            }

        }
    }
}