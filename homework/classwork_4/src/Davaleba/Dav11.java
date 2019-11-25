package Davaleba;

import java.util.Scanner;

public class Dav11 {
    public Dav11(){
        String a = GetValue();
        binaryToDecimal(a);
    }

    private String GetValue() {
        Scanner scan = new Scanner(System.in);

        System.out.println("a = ");
        String a= scan.nextLine();
        System.out.println("a = "+a);

        return a;
    }

    private void binaryToDecimal(String a) {
        int strlen = a.length();
        strlen--;
        int max  = strlen;

        int mtvleli = 0;

        while (strlen != -1){
            int digit = Integer.parseInt(String.valueOf(a.charAt(strlen)));
            if (digit == 1){
                int index = max-strlen;
                mtvleli += Math.pow(2,index);
            }
            strlen--;
        }
        System.out.println(mtvleli);
    }
}
