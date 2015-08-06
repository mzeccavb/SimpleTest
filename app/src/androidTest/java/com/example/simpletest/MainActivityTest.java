package com.example.simpletest;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;

/**
 * Created by mzecca on 8/6/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity activity = null;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

        injectInstrumentation(InstrumentationRegistry.getInstrumentation());

        activity = getActivity();
    }

    @SmallTest
    public void testButton1() throws Exception {
        Button btn = (Button) getActivity().findViewById(R.id.myButton1);

        assertTrue("Incorrect button 1 text!", btn.getText().equals("Button1"));
    }

    @SmallTest
    public void testButton2() throws Exception {
        Button btn = (Button) getActivity().findViewById(R.id.myButton2);

        assertTrue("Incorrect button 2 text!", btn.getText().equals("Button2"));
    }

    @SmallTest
    public void testButton3() throws Exception {
        Button btn = (Button) getActivity().findViewById(R.id.myButton3);

        assertTrue("Incorrect button 3 text!", btn.getText().equals("Button3"));
    }

    @SmallTest
    public void testButton1Action() throws Exception {
        Espresso.onView(ViewMatchers.withId(R.id.myButton1))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withText("You pressed a button 1!"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(android.R.id.button1))
                .perform(ViewActions.click());
    }

    @SmallTest
    public void testButton2Action() throws Exception {
        Espresso.onView(ViewMatchers.withId(R.id.myButton2))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withText("You pressed a button 2!"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(android.R.id.button1))
                .perform(ViewActions.click());
    }

    @SmallTest
    public void testButton3Action() throws Exception {
        Espresso.onView(ViewMatchers.withId(R.id.myButton3))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withText("You pressed a button 3!"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(android.R.id.button1))
                .perform(ViewActions.click());
    }
}
