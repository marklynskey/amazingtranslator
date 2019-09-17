package nz.ac.eit;

import org.junit.Before;
import org.junit.Test;

import javax.management.BadStringOperationException;

import static org.junit.Assert.*;

public class InputCheckerTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test_checkNumber_with_1_should_return_1() {
        InputChecker checker = new InputChecker();
        assertEquals(checker.checkNumber("1"), 1);
    }

    @Test
    public void test_checkNumber_with_5_should_return_5() {
        InputChecker checker = new InputChecker();
        assertEquals(checker.checkNumber("5"), 5);
    }

    @Test
    public void test_checkLanguage_with_GER_should_return_GER() throws BadStringOperationException {
        InputChecker checker = new InputChecker();
        assertEquals(checker.checkLanguage("GER"), "GER");
    }

    @Test
    public void test_checkLanguage_with_fra_should_return_FRA() throws BadStringOperationException {
        InputChecker checker = new InputChecker();
        assertEquals(checker.checkLanguage("fra"), "FRA");
    }

}