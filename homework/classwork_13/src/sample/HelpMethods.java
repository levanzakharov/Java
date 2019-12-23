package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HelpMethods {

    public static int CountLetter(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)  == '-')
                count++;
        }
        return count;
    }

    public static ArrayList SplitString(String text,String splitValue){
        String[] str = text.split(splitValue);
        return new ArrayList<>(Arrays.asList(str));
    }

    public static Boolean isNumber(String text){
        return text.matches("[0-9]+");
    }

    public static int RandomInt(int From, int To)
    {
        Random r = new Random();
        return r.nextInt((Math.max(From,To) - Math.min(From,To)) + 1) + Math.min(From,To);
    }




}
