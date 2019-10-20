import java.util.Scanner;

public class C {
    private static int a = 10;
    private static int b = 9;
    private static String s = "#";
    private static String h = "@";

    private static void Method1() {
        System.out.println("Method1: Integer variables: "+ a+","+b);
    }
    private static void Method2() {
        System.out.println("Method2: String variables: "+ s+","+h);
    }
    private static void Method3() {
        System.out.println("Method4: a+b = " + (a+b));
        System.out.println("Method4: a-b = " + (a-b));
        System.out.println("Method4: a*b = " + (a*b));
        System.out.println("Method4: a%b = " + (a%b));

    }
    private static void Method4() {
        System.out.println("a = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        a = Integer.parseInt(sc);
        System.out.println("Method4: a = "+a);
    }
    private static void Method5() {
        System.out.println("b = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        b = Integer.parseInt(sc);
        System.out.println("Method5: b = "+b);
    }
    private static void Method6() {
        System.out.println("Method6: s = ");
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        System.out.println(" s = "+s);

        System.out.println("Method6: h = ");
        Scanner scan1 = new Scanner(System.in);
        h = scan1.nextLine();
        System.out.println(" h = "+h);
    }

    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
        Method6();
    }

}
