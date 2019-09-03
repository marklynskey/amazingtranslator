package nz.ac.eit;

import java.util.HashMap;

public class Converter {

    HashMap<Integer, String> toEnglish = new HashMap<>();
    HashMap<Integer, String> toGerman = new HashMap<>();
    HashMap<Integer, String> toFrench = new HashMap<>();
    HashMap<Integer, String> toItalian = new HashMap<>();
    HashMap<Integer, String> toSpanish = new HashMap<>();

    public Converter() {
        initialiseLanguages();
    }

    public void initialiseLanguages()
    {
        // English
        toEnglish.put(1, "one");
        toEnglish.put(2, "two");
        toEnglish.put(3, "three");
        toEnglish.put(4, "four");
        toEnglish.put(5, "five");

        // German
        toGerman.put(1, "ein");
        toGerman.put(2, "zwei");
        toGerman.put(3, "drei");
        toGerman.put(4, "vier");
        toGerman.put(5, "funf");

        // French
        toFrench.put(1, "un");
        toFrench.put(2, "deux");
        toFrench.put(3, "trois");
        toFrench.put(4, "quatre");
        toFrench.put(5, "cinq");

        // Italian
        toItalian.put(1, "uno");
        toItalian.put(2, "due");
        toItalian.put(3, "tre");
        toItalian.put(4, "quattro");
        toItalian.put(5, "cinque");

        // Spanish
        toSpanish.put(1, "uno");
        toSpanish.put(2, "dos");
        toSpanish.put(3, "tres");
        toSpanish.put(4, "cuatro");
        toSpanish.put(5, "cinco");
    }

    public String convert(int number, String language)
    {
        switch (language) {
            case "ENG":
                return toEnglish.get(number);
            case "GER":
                return toGerman.get(number);
            case "FRA":
                return toFrench.get(number);
            case "ITA":
                return toItalian.get(number);
            case "ESP":
                return toSpanish.get(number);
            default:
                return "Error";
        }
    }

}
