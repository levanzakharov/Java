package Davaleba;

import FileMethods.FileMethods;

import java.util.ArrayList;

public class Dav2 {
    public Dav2(){
        FileMethods obj = new FileMethods();
        String fileName = "myFiles\\data1";
        obj.CreateFile(fileName);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            numbers.add(i);
        }

        ArrayList<ArrayList> DataList = new ArrayList<>();
        DataList.add(numbers);
        obj.WriteFile(fileName,DataList);
    }
}
