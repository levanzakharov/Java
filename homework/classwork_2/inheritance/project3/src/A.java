import java.util.Random;
import java.util.Scanner;

public class A {
    public int x;
    public int y;

    public int[] MethodA1(){
        System.out.println("x = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        x = Integer.parseInt(sc);

        System.out.println("y = ");
        Scanner scan1 = new Scanner(System.in);
        String sc1= scan1.nextLine();
        y = Integer.parseInt(sc1);

        return new int[]{x,y};
    }

    public int[] MethodA2(){
        double random =  new Random().nextDouble();
        x = (int) (12 + (random * (78 - 12)));

        double random1 =  new Random().nextDouble();
        y = (int) (12 + (random1 * (78 - 12)));

        return new int[]{x,y};
    }

    public void MethodA3(int y) {
        System.out.println("y = " + y);
    }
}
