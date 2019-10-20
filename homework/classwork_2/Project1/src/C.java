import java.util.Arrays;
import java.util.Scanner;

public class C {
    private int a;
    private int b;
    private int c;

    public int[] Method1() {
        System.out.println("a = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        a = Integer.parseInt(sc);
        System.out.println("Method1: a = "+a);

        System.out.println("b = ");
        Scanner scan1 = new Scanner(System.in);
        String sc1= scan1.nextLine();
        b = Integer.parseInt(sc1);
        System.out.println("Method1: b = "+b);

        System.out.println("c = ");
        Scanner scan2 = new Scanner(System.in);
        String sc2= scan2.nextLine();
        c = Integer.parseInt(sc2);
        System.out.println("Method1: c "+c);

        return new int[] {a, b, c};

    }

    public int Method2(int[] ar) {
        a = ar[0];
        String nm = Integer.toString(a);

        System.out.println("Method2: last char of a = " + (nm.charAt(nm.length()-1)));
        return ar[0];
    }

    public int Method3(int[] ar) {
        b = ar[1];
        String nm = Integer.toString(b);

        System.out.println("Method3: first char of b = " + (nm.charAt(0)));
        return ar[1];
    }

    public void Method4(int[] ar) {
        c = ar[2];
        String nm = Integer.toString(c);
        int jami = 0;
        int cvladi;
        for (int i = 0;i<nm.length();i++){
            cvladi = Integer.parseInt(String.valueOf(nm.charAt(i)));
            jami += cvladi;
        }

        System.out.println("Method4: sum of chars in c = " + (jami));
    }

    public int Method5(int[] ar,int a) {
        int product = ar[0] * ar[1] * ar[2] * a;
        System.out.println("Method5: product = " + product);
        return product;
    }

    public int Method6(int method5,int b) {
        int sum = method5 + b;
        System.out.println("Method6: sum = " + sum);
        return sum;
    }
}
