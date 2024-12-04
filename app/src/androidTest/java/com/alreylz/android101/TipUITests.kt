package com.alreylz.android101

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import java.text.NumberFormat

class TipUITests {

    @get: Rule
    val composeTestRule = createComposeRule()


    @Test
    fun calculate_30_percent_tip() {
        //Generamos la UI sobre la que probar
        composeTestRule.setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                MyForm();
            }
        }

        //Definimos qué hacer sobre la interfaz
        composeTestRule.onNode(hasText("Amount")).performTextInput("100");

        composeTestRule.onNode(hasText("Percentage")).performTextInput("30");

        val expectedTip = NumberFormat.getCurrencyInstance().format(30)
        composeTestRule.onNodeWithText("Tip amount.$expectedTip")
            .assertExists("No node with such text was found")


    }


}