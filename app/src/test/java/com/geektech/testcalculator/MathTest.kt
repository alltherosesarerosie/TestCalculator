package com.geektech.testcalculator

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAddTest() {
        assertEquals("4", math?.summation("2", "2"))
    }

    @Test
    fun simplePositiveVarTest() {
        assertEquals("4", math?.summation("+2", "2"))
    }

    @Test
    fun simpleNegativeVarTest() {
        assertEquals("-4", math?.summation("-2", "-2"))
    }

    @Test
    fun simpleAddSymbolTest() {
        assertEquals("You have to enter only numbers !!!", math?.summation("aa2", "2"))
    }

    @Test
    fun simpleTestWithEmptyVar() {
        assertEquals("You have to enter only numbers !!!", math?.summation("2", ""))
    }

    @Test
    fun simpleAddDoubleTest() {
        assertEquals("You have to enter only Integers !!!", math?.summation("2.0", "2"))
    }


    @Test
    fun simpleDivTest() {
        assertEquals("1", math?.division("2", "2"))
    }

    @Test
    fun simplePositiveVarDivTest() {
        assertEquals("1", math?.division("+2", "2"))
    }

    @Test
    fun simpleNegativeVarDivTest() {
        assertEquals("1", math?.division("-2", "-2"))
    }

    @Test
    fun simpleSymbolDivTest() {
        assertEquals("You have to enter only numbers !!!", math?.division("aa2", "2"))
    }

    @Test
    fun simpleTestWithEmptyDivVar() {
        assertEquals("You have to enter only numbers !!!", math?.division("", "5"))
    }

    @Test
    fun simpleDoubleTestDiv() {
        assertEquals("You have to enter only Integers !!!", math?.division("2.0", "2"))
    }

    @Test
    fun simpleDivByZero() {
        assertEquals("Division by zero is disallowed !!!", math?.division("2", "0"))
    }

    @Test
    fun simpleTestDivResDouble() {
        assertEquals("2.5", math?.division("5", "2"))
    }

    @After
    fun detach() {
        math = null
    }
}