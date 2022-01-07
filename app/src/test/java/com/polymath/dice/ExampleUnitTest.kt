package com.polymath.dice

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun generates_number()
    {
        val dice = Dice(6)
        val rollDice = dice.roll()
        assertTrue("The value of the rollResult was not between 0 and 7", rollDice in 1..6)

    }

}