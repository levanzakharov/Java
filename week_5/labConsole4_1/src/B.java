import java.util.Scanner;

public class B {
    private static int a = 33;
    private static double b = 9.7;
    private static String s = "#";

    private static void Method1() {
        System.out.println("Method1: s = "+ s);
    }
    private static void Method2() {
        System.out.println("Method2: a = " + a);
    }
    private static void Method3() {
        System.out.println("Method3: b = " + b);
    }
    private static void Method4() {
        double c = a-b;
        System.out.println("Method4: a-b = " + c);
    }
    private static double Method5() {
        return (a/b);
    }
    private static void Method6() {
        a = 10;
        b = 2.5;
        s = "$";
        System.out.println("Method7: a = "+a+" b = "+b+" s = "+s);
    }
    private static void Method7() {
        System.out.println("a = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        int c = Integer.parseInt(sc);
        a = c;
        System.out.println("Method7: a = "+a);
    }

    private static void Method8() {
        System.out.println("Method8: b = "+(b+10));
    }


    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
        Method4();
        System.out.println(Method5());
        Method6();
        Method7();
        Method8();

    }

}
