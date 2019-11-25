package Davaleba;

import FileMethods.FileMethods;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dav8 {
    private static ArrayList<ArrayList> DataList = new ArrayList<>();
    private static DecimalFormat df = new DecimalFormat("0.00");

    public Dav8(){
        FileMethods obj = new FileMethods();
        String fileName = "myFiles\\function";

        int[] values = {0,1,2};
        double e = 2.71828182846;
        ArrayList<String> list = new ArrayList<>();

        for (int value : values) {

            String y = df.format(Math.sin(value) + Math.pow(e, value) + 1);
            list.add(y);
        }

        DataList.add(list);
        obj.WriteFile(fileName,DataList);

    }
}
