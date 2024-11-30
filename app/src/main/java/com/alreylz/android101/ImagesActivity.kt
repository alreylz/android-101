package com.alreylz.android101

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
// Resources
import com.alreylz.android101.R.drawable.androidparty
import com.alreylz.android101.R.drawable.thispersondoesnotexist
import com.alreylz.android101.ui.theme.Android101Theme

class ImagesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android101Theme {
                val bgImage = painterResource(androidparty);


                Box {
                    Image(painter = bgImage, "background of party",
                        alpha=0.5F)
                    ImageBirthdayCard(
                        "Persona con gorra random",
                        27,
                        message = "Keep it up bro"
                    );
                }
            }

        }
    }
}


@Composable
fun ImageBirthdayCard(
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
        val avatarImage = painterResource(thispersondoesnotexist);




        Text(
            "${name} ",
            color = Color.Blue,
            fontSize = TextUnit(40f, TextUnitType.Sp), // fontSize = 12.sp
            textAlign = TextAlign.Center,
            lineHeight = 1.em,
            modifier = Modifier
                .padding(12.dp)
                .border(width = 2.dp, color = Color.Green)
        )
        Box {
            Image(
                painter = avatarImage, contentDescription = "the guy from the birthday",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(300.dp)
                    .clip(CircleShape)
                    .border(1.dp, Color.Gray, CircleShape)
            )
        }
        Text(
            "Happy ${age} birthday ",
            fontSize = 6.em,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(12.dp)
        )
        Text(
            "${message} ",
            textAlign = TextAlign.Center,
            fontSize = 4.em,
            modifier = Modifier.padding(30.dp).background(color = Color.White)
        )
        Text(
            "${from} ",
            textAlign = TextAlign.Right,

            modifier = Modifier
                .padding(12.dp)
                .align(alignment = Alignment.End)

        )

    }
}


@Preview(
    showBackground = true,
    name = "alreylz-Preview-Images"
)
@Composable
fun ShowCodePreviewImages() {
    Android101Theme {
        val bgImage = painterResource(androidparty);
        Box {
            Image(painter = bgImage, "background of party", alpha=0.5F)
            ImageBirthdayCard(
                "Persona con gorra random",
                27,
                message = "Keep it up bro"
            );
        }
    }
}