package FileMethods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileMethods {
    private static String path = "E:\\JAVA\\Java\\homework\\classwork_4\\src\\";

    public void CreateFile(String Filename) {
        try {
            File myObj = new File(path + Filename + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void WriteFile(String Filename,ArrayList<ArrayList> DataList) {
        try {
            FileWriter myWriter = new FileWriter(path + Filename + ".txt",true);

           // String.valueOf(DataList);

            for (ArrayList o : DataList) {
                for (Object o1 : o) {
                    System.out.println(o1);
                    myWriter.write(o1.toString()+"\n");
                }
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public ArrayList<String> ReadFile(String Filename) throws IOException {
        ArrayList<String> Numbers = new ArrayList<>();
        try {
            ArrayList<String> fileContent = new ArrayList<String>(Files.readAllLines(Paths.get(path + Filename + ".txt"), StandardCharsets.UTF_8));
            Numbers.addAll(fileContent);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return Numbers;
    }
}
