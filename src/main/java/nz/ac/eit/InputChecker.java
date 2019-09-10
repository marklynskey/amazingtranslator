package nz.ac.eit;

import javax.management.BadStringOperationException;

public class InputChecker {

    public InputChecker() {}

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
        language.toUpperCase();
        String[] supportedLanguages = {"ENG", "FRA", "GER", "ITA", "ESP"};
        boolean languageSupported = false;
        for (int i = 0; i < supportedLanguages.length; i++) {
            if (language.equals(supportedLanguages[i])) {
                return language;
            }
        }
        // If language not supported, throw exception
        throw new BadStringOperationException(language);
    }

}
