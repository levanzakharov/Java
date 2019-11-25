package Davaleba;

import FileMethods.FileMethods;

import java.util.ArrayList;

public class Dav9 {
    public Dav9(){
        FileMethods obj = new FileMethods();
        ArrayList<ArrayList> DataList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 10001; i++){
            String fileName = "myFiles\\"+i;
            obj.CreateFile(fileName);
            list.add(i);
            obj.WriteFile(fileName,DataList);
        }
        DataList.add(list);
    }
}
