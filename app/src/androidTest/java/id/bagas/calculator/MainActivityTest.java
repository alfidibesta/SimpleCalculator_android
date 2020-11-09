package id.bagas.calculator;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import androidx.test.filters.LargeTest;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityActivityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void TesTTambah() {
        onView(withId(R.id.edit_text_angka_pertama)).perform(click()).perform(replaceText("2"),closeSoftKeyboard());
        onView(withId(R.id.edit_text_angka_kedua)).perform(click()).perform(replaceText("2"),closeSoftKeyboard());
        onView(withId(R.id.button_tambah)).perform(click());
        onView(withId(R.id.text_hasil)).check(matches(withText("4")));
    }

    @Test
    public void TestKurang() {
        onView(withId(R.id.edit_text_angka_pertama)).perform(click()).perform(replaceText("2"),closeSoftKeyboard());
        onView(withId(R.id.edit_text_angka_kedua)).perform(click()).perform(replaceText("2"),closeSoftKeyboard());
        onView(withId(R.id.button_kurang)).perform(click());
        onView(withId(R.id.text_hasil)).check(matches(withText("0")));
    }

    @Test
    public void TesTKali() {
        onView(withId(R.id.edit_text_angka_pertama)).perform(click()).perform(replaceText("2"),closeSoftKeyboard());
        onView(withId(R.id.edit_text_angka_kedua)).perform(click()).perform(replaceText("2"),closeSoftKeyboard());
        onView(withId(R.id.button_kali)).perform(click());
        onView(withId(R.id.text_hasil)).check(matches(withText("4")));
    }

    @Test
    public void TesTBagi() {
        onView(withId(R.id.edit_text_angka_pertama)).perform(click()).perform(replaceText("2"),closeSoftKeyboard());
        onView(withId(R.id.edit_text_angka_kedua)).perform(click()).perform(replaceText("2"),closeSoftKeyboard());
        onView(withId(R.id.button_bagi)).perform(click());
        onView(withId(R.id.text_hasil)).check(matches(withText("1")));
    }


}