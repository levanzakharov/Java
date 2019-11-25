package Davaleba;

import FileMethods.FileMethods;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dav15 {
    private static ArrayList<ArrayList> DataList = new ArrayList<>();

    public Dav15() throws IOException {
        FileMethods obj = new FileMethods();
        String fileName = "myFiles\\info";
        obj.CreateFile(fileName);

        int[] values = GetValues();
        RandomGenerator(values[0],values[1]);

        //WriteFile(fileName,DataList);

        ArrayList<String> Numbers = obj.ReadFile(fileName);
        int Count0 = 0;
        int Count1 = 0;
        for (String str : Numbers) {
            char[] array = str.toCharArray();
            for (char ch : array) {
                if (ch == '0'){
                    Count0++;
                }
                else {
                    Count1++;
                }
            }
        }
        System.out.println("Total 0 is : "+ Count0+ "\nTotal 1 is : "+Count1);
    }

    private int[] GetValues(){
        Scanner scan = new Scanner(System.in);

        System.out.println("m = ");
        int m= scan.nextInt();

        System.out.println("n = ");
        int n= scan.nextInt();

        return new int[]{m,n};
    }

    private void RandomGenerator(int m, int n){
        if (m <= 50 && n <= 50 ){
            for (int i = 0; i<m; i++){
                ArrayList<Integer> Numbers = new ArrayList<>();
                for (int j = 0; j < n; j++){
                    Numbers.add((int)Math.round(Math.random()));
                }
                DataList.add(Numbers);
            }
        }
        else {
            System.out.println("Please Enter numbers under 50");
        }
    }

    private void WriteFile(String fileName,ArrayList<ArrayList> DataList) {
        try {
            FileWriter myWriter = new FileWriter("E:\\JAVA\\Java\\homework\\classwork_4\\src\\" + fileName + ".txt",true);

            for (ArrayList o : DataList) {
                for (Object o1 : o) {
                    myWriter.write(o1.toString());
                }
                myWriter.write("\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
