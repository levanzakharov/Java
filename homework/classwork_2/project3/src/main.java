import java.sql.SQLOutput;

public class main {
    public static void main(String[] args){
        int x = 5;
        int y = 7;
        int z = 3;

        System.out.println("x = "+x+"  y = "+y+"  z = "+z);

        class1 obj1 = new class1();
        int class1_1 = obj1.Method1(x);
        int class1_2= obj1.Method2(y,z);
        int class1_3 = obj1.Method3(x,y,z);

        System.out.println("2*x-7 = "+class1_1);
        System.out.println("3*y+z = "+class1_2);
        System.out.println("12*y-x+z = "+class1_3);



        int n = 5;
        y = 2;

        System.out.println("");
        System.out.println("n = "+n+"  y = "+y);

        class2 obj2 = new class2();
        int class2_1 = obj2.Method1(n);
        int class2_2= obj2.Method2(y,z);

        System.out.println("2n^2+1 = "+class2_1);
        System.out.println("3y^3-n^2 = "+class2_2);



        double a = 1;
        double b = 1;

        System.out.println("");
        System.out.println("a = "+a+"  b = "+b);

        class3 obj3 = new class3();
        double class3_1 = obj3.Method1(a,b);
        double class3_2= obj3.Method2(a,b);

        System.out.println("4n^2/b-1 = "+class3_1);
        System.out.println("3a^3/2-b^2 = "+class3_2);




        a = 6;
        b = 3;
        z = 2;

        System.out.println("");
        System.out.println("a = "+a+"  b = "+b+"  z = "+z);

        class4 obj4 = new class4();
        double class4_1 = obj4.Method1(a,b,z);
        double class4_2= obj4.Method2(a,b,z);
        double class4_3= obj4.Method3(a,b,z);

        System.out.println("(a+b^3-7)/(z+8) = "+class4_1);
        System.out.println("(a+z-b^3)/(z*a*b) = "+class4_2);
        System.out.println("(a*z-b)/(z*b) = "+class4_3);

    }
}
