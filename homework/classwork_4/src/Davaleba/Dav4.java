package Davaleba;

import FileMethods.FileMethods;

import java.util.ArrayList;

public class Dav4 {
    public Dav4(){
        FileMethods obj = new FileMethods();
        ArrayList<ArrayList> DataList = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < 31; i++){
            list.add("Programmer"+i);
        }
        DataList.add(list);
        for (int i = 1; i < 31; i++){
            String fileName = "myFiles2\\data"+i;
            obj.CreateFile(fileName);

            obj.WriteFile(fileName,DataList);
        }
    }
}
