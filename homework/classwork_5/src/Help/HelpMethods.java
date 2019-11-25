package Help;

import java.io.IOException;

public class HelpMethods {
    public static void clearScreen() {
        for(int i = 0; i < 2; i++){
            System.out.println("\b");
        }
    }

    public static boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
