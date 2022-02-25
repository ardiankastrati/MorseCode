package MorseCode;

import java.util.Scanner;

public class MorseTranslator {
    public static void main(String[] args) {
        Morse morse = new Morse();
        Scanner read = new Scanner(System.in);

        String[] symbol
                = {"*-", "-***", "-*-*", "-**", "*",
                "**-*", "--*", "****", "**", "*---",
                "-*-", "*-**", "--", "-*", "---",
                "*--*", "--*-", "*-*", "***", "-",
                "**-", "***-", "*--", "-**-", "-*--",
                "--**"};

        String morseCode = "*--- *- ***- *-";
        System.out.println("Enter a name: ");
        String text = read.nextLine();

        //Denna felhantering hanterar fler fel
        //1. Man kan inte mata in siffror, då vi endast vill ha bokstäver
        //2. Man kan inte mata in specialtecken
        //3. Man kan inte lämna fältet tomt
        while(!text.matches("[a-zA-Z]+")){
            System.out.println("Please enter a English word/name: ");
            text = read.nextLine();
        }


        Morse.textToMorse(symbol, text);
        System.out.println();
        Morse.morseToText(symbol, morseCode);

    }
}
