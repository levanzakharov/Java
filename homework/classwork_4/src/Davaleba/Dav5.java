package Davaleba;

import FileMethods.FileMethods;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dav5 {
    private static ArrayList<ArrayList> DataList = new ArrayList<>();

    public Dav5(){
        FileMethods obj = new FileMethods();
        String fileName = "myFiles\\data2";
        obj.CreateFile(fileName);

        int[] values = GetValues();
        RandomRange(values[0],values[1]);

        obj.WriteFile(fileName,DataList);

    }

    private int[] GetValues(){
        Scanner scan = new Scanner(System.in);

        System.out.println("a = ");
        int x= scan.nextInt();

        System.out.println("b = ");
        int y= scan.nextInt();

        return new int[]{x,y};
    }

    private void RandomRange(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int range = Math.max(a,b) - Math.min(a,b) + 1;

        for (int i = 0; i < 100; i++){
            Random rn = new Random();
            int n =  (rn.nextInt(range) + 10);
            list.add(n);
        }

        DataList.add(list);
    }
}
