import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        A objA = new A();

        //int[] ar = objA.Method1();
        int[] ar = objA.Method2();

        int sum = objA.Method3(ar);

        int product = objA.Method4(ar);

        System.out.println("ar = "+ Arrays.toString(ar));

        System.out.println("sum = "+sum);

        System.out.println("product = "+product);

        System.out.println("");

        B objB = new B();
        //double[] arB = objB.Method1();
        double[] arB = objB.Method2();

        System.out.println("arB = "+ Arrays.toString(arB));

        objB.Method3(arB);
        System.out.println(objB.Method4(arB));

    }

}
