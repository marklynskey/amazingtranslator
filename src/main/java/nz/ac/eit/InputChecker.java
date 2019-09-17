package nz.ac.eit;

import javax.management.BadStringOperationException;
import java.util.ArrayList;

public class InputChecker {

    ArrayList supportedLanguages = new ArrayList();

    public InputChecker() {
        supportedLanguages.add("ENG");
        supportedLanguages.add("FRA");
        supportedLanguages.add("GER");
        supportedLanguages.add("ITA");
        supportedLanguages.add("ESP");
    }

    public int checkNumber(String stringNumber) throws IndexOutOfBoundsException, NumberFormatException {
        int number;
        try {
            number = Integer.parseInt(stringNumber);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(stringNumber);
        }
        if (number < 1 || number > 5) {
            throw new IndexOutOfBoundsException(stringNumber);
        }
        return number;
    }

    public String checkLanguage(String language) throws BadStringOperationException {
        language = language.toUpperCase();
        if (supportedLanguages.contains(language)) {
            return language;
        } else {
            throw new BadStringOperationException(language);
        }
    }

}
