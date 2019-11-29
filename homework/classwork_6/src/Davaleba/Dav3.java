package Davaleba;

import java.util.Scanner;

public class Dav3 {
    public Dav3(){
        DoublePalindrom(GetValues());
    }

    private int GetValues(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number = ");
        return scan.nextInt();
    }

    private static void DoublePalindrom(int number){
        int remainder;
        int sum = 0;

        while(number > 0){
            remainder= number % 10;
            sum= (sum * 10) + remainder;
            number= number / 10;
        }

        System.out.println(sum*2);
    }
}
