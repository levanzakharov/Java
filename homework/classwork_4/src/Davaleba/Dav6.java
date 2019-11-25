package Davaleba;

import FileMethods.FileMethods;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dav6 {
    private static ArrayList<ArrayList> DataList = new ArrayList<>();

    public Dav6(){
        FileMethods obj = new FileMethods();
        String fileName = "myFiles\\data3";
        obj.CreateFile(fileName);

        double[] values = GetValues();
        RandomRange(values[0],values[1]);

        obj.WriteFile(fileName,DataList);

    }

    private double[] GetValues(){
        Scanner scan = new Scanner(System.in);

        System.out.println("a = ");
        double x= scan.nextDouble();

        System.out.println("b = ");
        double y= scan.nextDouble();

        return new double[]{x,y};
    }

    private void RandomRange(double a, double b) {
        ArrayList<Double> list = new ArrayList<>();
        double range = Math.max(a,b) - Math.min(a,b) + 1;

        for (int i = 0; i < 50; i++){
            Random rn = new Random();
            double n = (range) * rn.nextDouble();
            list.add(n);
        }

        DataList.add(list);
    }
}
