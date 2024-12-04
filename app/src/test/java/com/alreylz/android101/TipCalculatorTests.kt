package com.alreylz.android101

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {


    //Example of unit test
    @Test
    fun calculateTip_30PercentNoRoundUp() {
        //Prepare data
        val billAmount = 100.0;
        val tipPercent = 30.0;
        val roundUp = false;

        //Run code being tested
        val result = calculateTip(amount = billAmount, tipPercent = tipPercent, roundUp = roundUp);
        val resultFormatDevice = result

        val resultExpected = NumberFormat.getCurrencyInstance().format(30.0)
        println("$resultExpected $result")
        //Assert results match expectations
        assertEquals(resultFormatDevice, resultExpected)
    }


}