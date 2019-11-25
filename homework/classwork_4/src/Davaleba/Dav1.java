package Davaleba;

import FileMethods.FileMethods;

import java.util.ArrayList;

public class Dav1 {
    public Dav1(){
        FileMethods obj = new FileMethods();
        String fileName = "myFiles\\data";
        obj.CreateFile(fileName);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(24);
        numbers.add(39);
        numbers.add(-90);

        ArrayList<ArrayList> DataList = new ArrayList<>();
        DataList.add(numbers);
        obj.WriteFile(fileName,DataList);
    }
}
