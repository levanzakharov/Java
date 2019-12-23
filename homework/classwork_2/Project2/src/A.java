import java.util.Arrays;
import java.util.Scanner;

public class A{
    private int[] m = new int[10];

    public int[] Method1() {
        for (int i = 0;i<m.length;i++){
            System.out.println("m"+(i+1)+" = ");
            Scanner scan = new Scanner(System.in);
            String sc= scan.nextLine();
            m[i] = Integer.parseInt(sc);
        }

        return m;
    }

    public int[] Method2() {
        for (int i = 0;i<m.length;i++){
            m[i] = (int) ((Math.random()*(15+1)));
        }

        return m;
    }

    public int Method3(int[] ar) {
        int sum = 0;

        for (int i = 0;i<ar.length;i++){
            if (ar[i]<i){
                sum += ar[i];
            }
        }

        return sum;
    }

    public int Method4(int[] ar) {
        int product = 1;

        for (int i = 0;i<ar.length;i++){
            if (ar[i]>i){
                product *= ar[i];
            }
        }

        return product;
    }
}
