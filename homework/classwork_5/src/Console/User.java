package Console;
import Help.HelpMethods;
import java.util.Scanner;

public class User{
    private static Scanner input;
    private static int Choice;

    public static int ChangeExchangeCourse(){
        System.out.println("Do You Like To Change Exchange Course?");
        System.out.print("Enter 1 to Change OR Enter 2 to Skip: ");
        input = new Scanner(System.in);
        Choice = input.nextInt();
        HelpMethods.clearScreen();
        return Choice;
    }

    public static int BuyOrSell(){
        System.out.println("Do You Like To Buy or Sell?");
        System.out.print("Enter 1 to Buy OR Enter 2 to Sell: ");
        input = new Scanner(System.in);
        Choice = input.nextInt();
        HelpMethods.clearScreen();
        return Choice;
    }

    public static int CurrencyChoice(){
        System.out.println("What Currency do you want?");
        System.out.print("Enter 1(USD),2(EUR),3(GBP): ");
        input = new Scanner(System.in);
        Choice = input.nextInt();
        HelpMethods.clearScreen();
        return Choice;
    }

    public static float EnterMoney(){
        System.out.print("Please Enter Money: ");
        input = new Scanner(System.in);
        return input.nextFloat();
    }


}
