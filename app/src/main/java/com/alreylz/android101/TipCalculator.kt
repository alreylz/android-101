package com.alreylz.android101

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alreylz.android101.ui.theme.Android101Theme


import java.text.NumberFormat


class TipCalculator() : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android101Theme {
                MyForm()

            }
        }
    }

}


@Composable
@Preview(
    showBackground = true, showSystemUi = true
)
fun FormPreview() {
    Android101Theme {
        MyForm(
            modifier = Modifier.border(width = 12.dp, color = Color.Cyan)
        )

    }

}


@Composable
fun MyForm(modifier: Modifier = Modifier) {

    // States
    var billAmountInput by remember { mutableStateOf("") }

    val billAmount = billAmountInput.toDoubleOrNull() ?: 0.0;

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Calculate tip",
            fontSize = 8.em,
            textAlign = TextAlign.Center,
            lineHeight = 1.em
        )
        Spacer(modifier = Modifier.padding(12.dp))

        /* My composable component */
        MyNumberInputField(
            value = billAmountInput,
            onValueChange = { nuValue -> billAmountInput = nuValue }
        )
        Spacer(modifier = Modifier.padding(12.dp))
        Text(
            text = "Tip amount.${calculateTip(billAmount, 15.0)} $ ",
            fontSize = 8.em,
            textAlign = TextAlign.Center,
            lineHeight =
            1.em,
            color = "#efc44d".color
        )

    }

}


/**
 * Custom numeric input field component
 * @param value the mutable value to show initially and alter later on user input
 * @param modifier allows further customization of how things look
 * @param label optional label for the field
 * @param onValueChange function to execute when the field input changes (e.g., updating the value)
 */
@Composable
private fun MyNumberInputField(
    value: String,
    modifier: Modifier = Modifier,
    label: String? = "Numeric input field",
    onValueChange: (String) -> Unit
) {

    TextField(
        value = value,
        singleLine = true,
        onValueChange = onValueChange,
        /* Show only numeric keyboard */
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = modifier.padding(2.dp),
        /*Optionally allow for changing the label*/
        label = { if (label != null) Text("$label :") }
    )


}


/***
 * Calculates a tip amount based on a base amount being paid
 * @param amount Total amount of money paid from which the tip will be calculated
 * @param tipPercent Percent of tip to apply
 * @author alreylz
 * @return calculated tip
 */
private fun calculateTip(amount: Double, tipPercent: Double = 15.0): String {
    val tip = tipPercent / 100 * amount
    return NumberFormat.getCurrencyInstance().format(tip)
}


//Extension properties
val String.color
    get() = Color(parseColor(this))
