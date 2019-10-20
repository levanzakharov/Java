public class A {
    private static int a = 10;
    private static int b = 29;


    private static void Method1() {
        System.out.println("Method1: Hello OPP");
    }
    private static void Method2() {
        System.out.println("Method2: a = " + a);
    }
    private static void Method3() {
        System.out.println("Method3: b = " + b);
    }
    private static void Method4() {
        System.out.println("Method4: a+b = " + (a+b));
    }
    private static int Method5() {
        return (a+b);
    }
    private static int Method6() {
        return (a*b);
    }
    private static void Method7() {
        a = 5;
        b = 6;
        System.out.println("Method7: a = "+a+" b = "+b);
    }

    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
        Method4();
        System.out.println(Method5());
        System.out.println(Method6());
        Method7();
    }

}
