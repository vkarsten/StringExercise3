package main.java;

public class TextChecker {
    public static void main(String[] args) {
       // Task:
//        We have a text less than 500 chars , and we are facing so many typing errors , please write methods for :
//        please in main method use scanner to read the input for every method from the CLI
    }
    // 1- write a method to check the number of chars , it returns “Error message ” if it exceeds 500 !!
    public String checkLength(String text) {
        if (text.length() > 500) {
            return "Error";
        }
        return "Text is not more than 500 characters";
    }

    // 2- write a method to replace a specified char with another one only one char should be replaced
    public String replaceFirstChar(String text, char toReplace, char replacement) {
        int charIndex = text.indexOf(toReplace);
        return text.substring(0, charIndex) + replacement + text.substring(charIndex+1);
    }

    // 3- write a method to replace a specified char with another all occurrences should be replaced
    public String replaceAllChars(String text, char toReplace, char replacement) {
        return text.replace(toReplace, replacement);
    }

    // 4- write a method to replace a phrase with new phrase one time only
    public String replaceFirstPhrase(String text, String toReplace, String replacement) {
        int startIndex = text.indexOf(toReplace);
        int endIndex = startIndex + toReplace.length();
        return text.substring(0, startIndex) + replacement + text.substring(endIndex);
    }

    // 5-  write a method to replace a phrase with new phrase  all occurrences should be replaced
    public String replaceAllPhrases(String text, String toReplace, String replacement) {
        return text.replace(toReplace, replacement);
    }

    // 6- write a method to delete a phrase from the text
    public String deletePhrase(String text, String toDelete) {
        return text.replace(toDelete, "");
    }
}
