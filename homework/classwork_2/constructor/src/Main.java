public class Main {
    public static void main(String[] args) {
        int x = 2;
        Class1 obj1 = new Class1();
        obj1.Method1(x);

        System.out.println("\n\n");

        x = 14;
        Class2 obj2 = new Class2();
        obj2.Method1(x);

        System.out.println("\n\n");

        int a = 3;
        int b = 18;
        x = 19;
        Class3 obj3 = new Class3();
        obj3.Method1(a,b);
        System.out.println("");
        obj3.Method2(a,b,x);

        System.out.println("\n\n");

        x = -3;
        int y = 3;
        Class4 obj4 = new Class4();
        System.out.println(obj4.Method1(x,y));

        System.out.println("");

        System.out.println(obj4.Method2(x,y));



        System.out.println("\n\n");

        x = -3;
        y = 3;
        Class5 obj5 = new Class5();
        System.out.println(obj5.Method1(x,y));

        System.out.println("");

        System.out.println(obj5.Method2(x,y));



        System.out.println("\n\n");

        x = 14;
        y = 100;
        Class6 obj6 = new Class6();
        System.out.println(obj6.Method1(x,y));

        System.out.println("");

        System.out.println(obj6.Method2(x,y));
    }

}
