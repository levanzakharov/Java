package Davaleba;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Dav4 {
    private static double[][] numbers = new double[6][5];

    public Dav4(){
        double[] values = GetValues();
        RandomGenerator(values[0],values[1]);

        System.out.println(Arrays.deepToString(numbers));

        Arrays.sort(numbers, Comparator.comparingDouble(a -> a[0]));

        System.out.println(Arrays.deepToString(numbers));

        //System.out.println("Total 0 is : "+ Count0+ "\nTotal 1 is : "+Count1);
    }

    private double[] GetValues(){
        Scanner scan = new Scanner(System.in);

        System.out.println("a = ");
        double x= scan.nextDouble();

        System.out.println("b = ");
        double y= scan.nextDouble();

        return new double[]{x,y};
    }

    private void RandomGenerator(double a, double b){
        double range = Math.max(a,b) - Math.min(a,b) + 1;
        Random rn = new Random();
        for (int i = 0; i<6; i++){
            for (int j = 0; j < 5; j++){
                numbers[i][j] = (range) * rn.nextDouble();
            }
        }
    }
}
