import java.util.Arrays;
import java.util.Scanner;

public class B{
    private double[] m = new double[12];

    public double[] Method1() {
        for (int i = 0;i<m.length;i++){
            System.out.println("m"+(i+1)+" = ");
            Scanner scan = new Scanner(System.in);
            String sc= scan.nextLine();
            m[i] = Double.parseDouble(sc);
        }

        return m;
    }

    public double[] Method2() {
        for (int i = 0;i<m.length;i++){
            m[i] = ((Math.random()*(15+1)));
        }

        return m;
    }

    public void Method3(double[] ar) {
        for (int i = 0;i<ar.length;i++){
            if (ar[i]>7){
                System.out.println("index = "+i+"; value = "+ar[i]);
            }
        }
    }

    public double Method4(double[] ar) {
        Arrays.sort(ar);
        return (ar[ar.length-1]-ar[0]);
    }
}
