package com.geektech.testcalculator

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.first_et)).perform(ViewActions.typeText("4"))
            delay(2000)
            Espresso.onView(withId(R.id.first_et)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.second_et)).perform(ViewActions.typeText("5"))
            Espresso.onView(withId(R.id.second_et)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.btn_plus)).perform(ViewActions.click())
            Espresso.onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("9")))
        }
    }
}