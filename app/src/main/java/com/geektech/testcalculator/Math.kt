package com.geektech.testcalculator

import android.text.TextUtils

class Math {

    fun summation(a: String, b: String): String {
        var result = ""

        if (a.isInteger() && b.isInteger()) {
            result = (a.toInt() + b.toInt()).toString()
        } else if(a.contains(".") || a.contains(".")){
            result = "You have to enter only Integers !!!"
        } else
            result = "You have to enter only numbers !!!"

        return result
    }

    fun division(a: String, b: String): String {
        var result = ""

        if (a.isInteger() && b.isInteger() && b!="0") {
            result = (a.toDouble() / b.toDouble()).toString()

            if(result.toDouble().toInt().toDouble() == result.toDouble()){
                result = result.toDouble().toInt().toString()}

        } else if(a.contains(".") || b.contains(".")){
            result = "You have to enter only Integers !!!"
        } else if(b=="0"){
            result = "Division by zero is disallowed !!!"
        }else {result = "You have to enter only numbers !!!"}



        return result
    }

    fun String.isInteger()=this.toIntOrNull()?.let { true } ?: false




}