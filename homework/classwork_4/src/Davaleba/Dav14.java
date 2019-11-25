package Davaleba;

import FileMethods.FileMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dav14 {
    private static ArrayList<ArrayList> DataList = new ArrayList<>();
    private static ArrayList<ArrayList> DataList1 = new ArrayList<>();

    public Dav14() throws IOException {
        FileMethods obj = new FileMethods();
        String fileName = "myFiles\\numbers";
        obj.CreateFile(fileName);

        int[] values = GetValues();
        BetweenTwoNumber(values[0],values[1]);

        obj.WriteFile(fileName,DataList);

        ArrayList<String> Numbers = obj.ReadFile(fileName);
        int EvenSum = 0;
        int OddSum = 0;
        for (int i = 0; i<10; i++){
            int number = Integer.parseInt(Numbers.get(i));
            if (number%2 == 0){
                EvenSum += number;
            }
            else {
                OddSum += number;
            }
        }

        System.out.println("OddSum = "+ OddSum +"    EvenSum = "+ EvenSum);

        fileName = "myFiles\\numbers2";
        obj.CreateFile(fileName);
        RandomRange(OddSum,EvenSum);

        obj.WriteFile(fileName,DataList1);

    }

    private int[] GetValues(){
        Scanner scan = new Scanner(System.in);

        System.out.println("a = ");
        int x= scan.nextInt();

        System.out.println("b = ");
        int y= scan.nextInt();

        return new int[]{x,y};
    }

    private void BetweenTwoNumber(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int range = max - min + 1;

        if (range > 40){
            for (int i = 1; i < 41; i++){
                list.add(min+i);
            }
            DataList.add(list);
        }
        else {
            System.out.println("please enter numbers which differs at least 40");
        }
    }

    private void RandomRange(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int range = Math.max(a,b) - Math.min(a,b) + 1;

        for (int i = 0; i < 5; i++){
            Random rn = new Random();
            int n =  (rn.nextInt(range) + 10);
            list.add(n);
        }

        DataList1.add(list);
    }
}
