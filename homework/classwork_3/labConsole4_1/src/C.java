import java.util.Scanner;

interface ClassC {
    void Method1();
    void Method2();
    void Method3();
    void Method4();
    void Method5();
    void Method6();

}

public class C implements ClassC {
    private static int a = 10;
    private static int b = 9;
    private static String s = "#";
    private static String h = "@";

    @Override
    public void Method1() {
        System.out.println("Method1: Integer variables: "+ a+","+b);
    }

    @Override
    public void Method2() {
        System.out.println("Method2: String variables: "+ s+","+h);
    }

    @Override
    public void Method3() {
        System.out.println("Method3: a+b = " + (a+b));
        System.out.println("Method3: a-b = " + (a-b));
        System.out.println("Method3: a*b = " + (a*b));
        System.out.println("Method3: a%b = " + (a%b));

    }

    @Override
    public void Method4() {
        System.out.println("a = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        a = Integer.parseInt(sc);
        System.out.println("Method4: a = "+a);
    }

    @Override
    public void Method5() {
        System.out.println("b = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        b = Integer.parseInt(sc);
        System.out.println("Method5: b = "+b);
    }

    @Override
    public void Method6() {
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
        C obj = new C();
        obj.Method1();
        obj.Method2();
        obj.Method3();
        obj.Method4();
        obj.Method5();
        obj.Method6();
    }

}
