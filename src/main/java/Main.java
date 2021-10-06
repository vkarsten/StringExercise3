package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Demo

        // Creating a new Scanner for reading the input
        Scanner textScanner = new Scanner(System.in);

        // Creating a new instance of the TextChecker class to use its methods
        TextChecker textChecker = new TextChecker();

        // Reading the text that will be manipulated
        System.out.println("Please enter a text:");
        String text = textScanner.nextLine();

        // Checking the length of the text
        System.out.println(textChecker.checkLength(text));

        // Reading the characters for the replacement
        System.out.println("Please enter the character you want to replace: ");
        char charToReplace = textScanner.nextLine().charAt(0);
        System.out.println("Please enter the character you want to insert instead: ");
        char replacementChar = textScanner.nextLine().charAt(0);

        // Replacing the first instance of the character
        System.out.println(textChecker.replaceFirstChar(text, charToReplace, replacementChar));
        // Replacing all occurrences of the character
        System.out.println(textChecker.replaceAllChars(text, charToReplace, replacementChar));

        // Reading the phrases for the replacement and deletion
        System.out.println("Please enter the phrase you want to replace: ");
        String phraseToReplace = textScanner.nextLine();
        System.out.println("Please enter the phrase you want to insert instead: ");
        String replacementPhrase = textScanner.nextLine();

        // Replacing the first instance of the phrase
        System.out.println(textChecker.replaceFirstPhrase(text, phraseToReplace, replacementPhrase));
        // Replacing all occurrences of the phrase
        System.out.println(textChecker.replaceAllPhrases(text, phraseToReplace, replacementPhrase));
        // Deleting the phrase
        System.out.println(textChecker.deletePhrase(text, phraseToReplace));

    }
}
