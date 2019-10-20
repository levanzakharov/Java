import java.util.Random;
import java.util.Scanner;

public class A {
    public double x;
    public double y;

    public double[] MethodA1(){
        System.out.println("x = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        x = Integer.parseInt(sc);

        System.out.println("y = ");
        Scanner scan1 = new Scanner(System.in);
        String sc1= scan1.nextLine();
        y = Integer.parseInt(sc1);

        return new double[]{x,y};
    }

    public double[] MethodA2(){
        double random =  new Random().nextDouble();
        x = (0 + (random * (12 - 0)));

        double random1 =  new Random().nextDouble();
        y = (0 + (random1 * (12 - 0)));

        return new double[]{x,y};
    }

    public void MethodA3(double x,double y) {
        System.out.println("(y-3x)/3 = " + (y-3*x)/3);
    }
}
