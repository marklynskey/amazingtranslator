package nz.ac.eit;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ConverterTest {

    private HashMap<Integer, String> toGerman = new HashMap<>();
    private HashMap<Integer, String> toSpanish = new HashMap<>();
    private HashMap<Integer, String> toEnglish = new HashMap<>();
    private Converter converter;

    @Before
    public void setUp() throws Exception {
        converter = new Converter();
    }

    @Test
    public void test_convert_1_to_german_should_return_ein() throws AssertionError {
        String expected = "ein";
        String actual = converter.convert(1, "GER");
        assertEquals("1 is not being converted to ein", expected, actual);
    }

    @Test
    public void test_convert_2_to_spanish_should_return_dos() throws AssertionError {
        String expected = "dos";
        String actual = converter.convert(2, "ESP");
        assertEquals("2 is not being translated to dos", expected, actual);
    }

    @Test
    public void test_convert_5_to_english_should_return_five() throws AssertionError {
        String expected = "five";
        String actual = converter.convert(5, "ENG");
        assertEquals("5 is not being translated to five", expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_convert_100_to_french_should_fail() throws IndexOutOfBoundsException {
        converter.convert(100, "FRA");
    }
}