import java.util.Random;
import java.util.Scanner;

public class B extends A {
    private double a;
    private double b;
    private double x;


    public double[] MethodB1(){
        System.out.println("a = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        a = Integer.parseInt(sc);

        System.out.println("b = ");
        Scanner scan1 = new Scanner(System.in);
        String sc1= scan1.nextLine();
        b = Integer.parseInt(sc1);

        return new double[]{a,b};
    }

    public double[] MethodB2(double a,double b){
        if (a>b){
            double k = a;
            a = b;
            b = k;
        }
        return new double[]{a,b};
    }

    public double MethodB3(double a,double b) {
        if (a>b){
            double random =  new Random().nextDouble();
            x = (b + (random * (a - b)));
        }
        else {
            double random =  new Random().nextDouble();
            x = (b + (random * (a - b)));
        }

        return x;
    }

    public static void main(String[] args) {
        B obj = new B();
        //int[] array = obj.MethodA1();
        double[] array = obj.MethodA2();
        obj.MethodA3(array[0],array[1]);

        double[] arrayB = obj.MethodB1();
        obj.MethodB2(arrayB[0],arrayB[1]);
        obj.MethodB3(arrayB[0],arrayB[1]);;

    }


}
