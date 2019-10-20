import java.util.Arrays;
import java.util.Scanner;

public class B {
    int a;
    int b;
    int c;

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

    public void Method2(int[] ar) {
        Arrays.sort(ar);
        System.out.println("Method2: max = " + (ar[2]));
    }

    public void Method3(int[] ar) {
        Arrays.sort(ar);
        System.out.println("Method3: min = " + (ar[0]));
    }
}
