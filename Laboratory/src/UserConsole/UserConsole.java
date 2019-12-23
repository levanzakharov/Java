package UserConsole;
import java.util.Scanner;

public class UserConsole{
    private static Scanner input;
    private static String Language;
    private static String Parameters;

    public static void StartText(){
        System.out.println("\nWelcome, This is Text Generator, Please Read how To Use It");
        System.out.println("Input language: en/ge/ru(Please Enter only one of them)”\n" +
                "Input parameters: p-2-s-5-7-w-7-9-l-7-9\n(p - paragraph, s - sentence(5-7 from 5 to 7 sentences in paragraph), w - word(7-9 from 7 to 9 words in sentence), l - letter(7-9 from 7 to 9 letters in word))\n\n");
    }

    public static String[] GetValues(){
        System.out.println("Input language: ");
        input = new Scanner(System.in);
        Language = input.nextLine();

        System.out.print("Input parameters: ");
        Parameters = input.nextLine();
        return new String[]{Language,Parameters};
    }
}
