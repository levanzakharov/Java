import java.util.Scanner;

public class A {
    int a;
    int b;

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

        return new int[] {a, b};

    }

    public void Method2(int[] ar) {
        System.out.println("Method2: a + b = " + (ar[0]+ar[1]));
    }

    public void Method3(int[] ar) {
        System.out.println("Method3: a * b = " + (ar[0]*ar[1]));
    }
}
