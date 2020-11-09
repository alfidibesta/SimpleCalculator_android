package id.bagas.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity main = new MainActivity();
    @Test
    public void addition_isCorrect() {
        assertEquals(4, main.tambah(2,2));}
    @Test
    public void substraction_isCorrect() {
        assertEquals(0, main.kurang(2,2));}
    @Test
    public void multiplication_isCorrect() {
        assertEquals(4, main.kali(2,2));}
    @Test
    public void division_isCorrect() {
        assertEquals(1, main.bagi(2,2));}
}