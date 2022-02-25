package MorseCode;

import java.util.*;

public class Morse {
    public static void morseToText(String[] symbol, String morseCode) {
        Map<String, Character> inEnglish = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            inEnglish.put(symbol[i], (char) ('a' + i));
        }

        String[] array = morseCode.split(" ");
        System.out.print( morseCode + " translated to English is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(inEnglish.get(array[i]) + " ");
        }
    }

    public static void textToMorse(String[] symbol, String text) {
        System.out.print(text + " in morse code is: ");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(symbol[text.charAt(i) - 'a'] + " ");
        }
        //System.out.println(" .");



    }

}
