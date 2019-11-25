package Davaleba;

import FileMethods.FileMethods;

import java.util.ArrayList;

public class Dav3 {
    public Dav3(){
        FileMethods obj = new FileMethods();
        ArrayList<ArrayList> DataList = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("Programmer");
        DataList.add(list);
        for (int i = 1; i < 31; i++){
            String fileName = "myFiles1\\data"+i;
            obj.CreateFile(fileName);

            obj.WriteFile(fileName,DataList);
        }
    }
}
