package Davaleba;

import java.util.Scanner;

public class Dav10 {
    public Dav10(){
        int num = GetValue();
        DecimalToBinary(num);
    }

    private int GetValue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("number = ");
        int num= scan.nextInt();
        System.out.println("number = "+num);
        return num;
    }

    private void DecimalToBinary(int num) {
        int[] binary = new int[64];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}
