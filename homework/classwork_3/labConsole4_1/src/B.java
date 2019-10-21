import java.util.Scanner;

interface ClassB {
    void Method1();
    void Method2();
    void Method3();
    void Method4();
    double Method5(int a,double b);
    void Method6();
    void Method7();
    void Method8();

}

public class B implements ClassB {
    private static int a = 33;
    private static double b = 9.7;
    private static String s = "#";


    @Override
    public void Method1() {
        System.out.println("Method1: s = "+ s);
    }

    @Override
    public void Method2() {
        System.out.println("Method2: a = " + a);
    }

    @Override
    public void Method3() {
        System.out.println("Method3: b = " + b);
    }

    @Override
    public void Method4() {
        double c = a-b;
        System.out.println("Method4: a-b = " + c);
    }

    @Override
    public double Method5(int a, double b) {
        return (a/b);
    }

    @Override
    public void Method6() {
        a = 10;
        b = 2.5;
        s = "$";
        System.out.println("Method7: a = "+a+" b = "+b+" s = "+s);
    }

    @Override
    public void Method7() {
        System.out.println("a = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        a = Integer.parseInt(sc);
        System.out.println("Method7: a = "+a);
    }

    @Override
    public void Method8() {
        System.out.println("Method8: b = "+(b+10));
    }


    public static void main(String[] args) {
        B obj = new B();
        obj.Method1();
        obj.Method2();
        obj.Method3();
        obj.Method4();
        obj.Method5(a,b);
        obj.Method6();
        obj.Method7();
        obj.Method8();

    }

}
