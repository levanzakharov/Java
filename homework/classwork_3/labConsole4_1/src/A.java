interface ClassA {
    void Method1();
    void Method2();
    void Method3();
    void Method4();
    int Method5(int a,int b);
    int Method6(int a,int b);
    void Method7();

}


public class A implements ClassA{
    private static int a = 10;
    private static int b = 29;


    @Override
    public void Method1() {
        System.out.println("Method1: Hello OPP");
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
        System.out.println("Method4: a+b = " + (a+b));
    }

    @Override
    public int Method5(int a,int b) {
        return (a+b);
    }

    @Override
    public int Method6(int a,int b) {
        return (a*b);
    }

    @Override
    public void Method7() {
        a = 5;
        b = 6;
        System.out.println("Method7: a = "+a+" b = "+b);
    }


    public static void main(String[] args) {
        A obj = new A();
        obj.Method1();
        obj.Method2();
        obj.Method3();
        obj.Method4();
        obj.Method5(a,b);
        obj.Method6(a,b);
        obj.Method7();
    }

}
