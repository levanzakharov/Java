package Davaleba;

import java.util.Scanner;

public class Dav1 {
    public Dav1(){
        CheckPalindrom(GetValues());
    }

    private int GetValues(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number = ");
        return scan.nextInt();
    }

    private static void CheckPalindrom(int number){
        int remainder;
        int sum = 0;
        int Original = number;

        while(number > 0){
            remainder= number % 10;
            sum= (sum * 10) + remainder;
            number= number / 10;
        }
        if(Original == sum) {
            System.out.println("Palindrome number ");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
