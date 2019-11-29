package Davaleba;

import java.util.Scanner;

public class Dav2 {
    public Dav2(){
        GetValues();
    }

    private int[] GetValues(){
        Scanner scan = new Scanner(System.in);

        System.out.println("n1 = ");
        int n1= scan.nextInt();

        System.out.println("n2 = ");
        int n2= scan.nextInt();

        System.out.println("n3 = ");
        int n3= scan.nextInt();

        System.out.println("n4 = ");
        int n4= scan.nextInt();

        System.out.println("n5 = ");
        int n5= scan.nextInt();

        return new int[]{n1,n2,n3,n4,n5};
    }
}
