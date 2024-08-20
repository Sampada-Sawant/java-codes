import java.io.*;
import java.util.*;
import java.lang.String;

public class Strings {
    static void traverseString(String str) {
        int vowelCount = 0;
        int consoCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') 
            {
                vowelCount++;
            } else {
                consoCount++;
            }
        }
        System.out.println("\nIn string " + str + ",\nNumber of vowels : " + vowelCount + "\nNumber of consonants : "
                + consoCount);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("\nEnter a string data : ");
        String data = read.nextLine();

        traverseString(data);
    }
}
