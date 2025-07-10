package JavaDevelopment.Lesson05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab05 {
    public static String longWord(String input){
        String [] parts = input.split(", | ");
        int length = 0;
        String longest = "";
        for (int i =0; i< parts.length; i++) {
            if (parts[i].length() > length) {
                length = parts[i].length();
                longest = parts[i];
            }
        }
        return longest;
    }
    public static void isPolyndrome(String input){
        String check = reverseWord(input);
        if (check.equalsIgnoreCase(input)){
            System.out.println("Слово " + input + " является палиндромом");
        }
        else {
            System.out.println("Слово " + input + " не является палиндромом");
        }
        System.out.println(check);
        System.out.println(input);
    }
    public static void censored (String input){
        StringBuilder modified = new StringBuilder(input);
        String censor = "Вырезано цензурой";
        input = input.replaceAll(" бяка ", censor);
        input = input.replaceAll(" бяка",censor);
        input = input.replaceAll("бяка ",censor);
        input = input.replaceAll("бяка",censor);
        System.out.println(input);
    }
    public static void checkEquality(String firstInput, String secondInput){
        String [] firstMod = firstInput.split("[ ?!,]");
        String [] secondMod = secondInput.split("[ ?!,]");
        int count =0;
        for (int i = 0; i<firstMod.length; i++){
            for (int j = 0; j<secondMod.length; j++){
                if (firstMod[i].equalsIgnoreCase(secondMod[j])){
                    count += 1;
                }
            }
        }
        System.out.println(Arrays.toString(firstMod));
        System.out.println(Arrays.toString(secondMod));
        System.out.println(count);
    }
    public static void reverseString (String input){
        String [] parts = input.split(" ");
        System.out.println(Arrays.toString(parts));
        String result = "";
        for (int i= 0; i< parts.length; i ++){
            parts[i] = reverseWord(parts[i]);
        }
        for (int i= 0; i< parts.length; i ++){
            result += parts[i];
            result += " ";
        }
        System.out.println(result);
    }
    private static String reverseWord(String input) {
        String result = "";
        char [] strMod = input.toCharArray();
        int length = strMod.length;
        for (int i=length-1; i>=0; i--){
            result += strMod[i];
        }
        return result;
    }
}
