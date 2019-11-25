public class main extends A {
    public static void main(String[] args) {
        A objA = new A();
        int[] ar = objA.Method1();
        objA.Method2(ar);
        objA.Method3(ar);

        B objB = new B();
        int[] ar1 = objB.Method1();
        objB.Method2(ar1);
        objB.Method3(ar1);

        C objC = new C();
        int[] ar2= objC.Method1();
        int a  = objC.Method2(ar2);
        int b = objC.Method3(ar2);
        objC.Method4(ar2);
        int method5 = objC.Method5(ar2,a);
        objC.Method6(b,method5);
    }

}
