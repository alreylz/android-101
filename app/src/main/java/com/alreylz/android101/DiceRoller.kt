package com.alreylz.android101

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
// Resources
import com.alreylz.android101.ui.theme.Android101Theme

// For the state
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

/**
 * Practice
 */
class DiceRoller : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiceRollerPreview()
        }

    }
}


@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier): Unit {


    var buttonText by remember { mutableStateOf("Roll Dice") };
    var result by remember { mutableStateOf(0) };

    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {

        //Assign the one image or other to variable depending on state
        val diceImageResource = when (result) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_0
        }
        val painterResource = painterResource(diceImageResource)

        Image(painter = painterResource, "Resultado de dado")


        if (result > 0) {
            Text("The result is ${result}!")

        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            result = (1..6).random();
            buttonText = "Roll again";
            Log.d("@alreylz", "Pressed button ${result}");

        }) {
            Text("${buttonText}")
        }

    }

}


@Preview(
    showBackground = true
)
@Composable
fun DiceRollerPreview() {
    Android101Theme {
        //Centra Verticalmente y ocupa el espacio completo de la página
        DiceWithButtonAndImage(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        );
    }
}