package File;
import HelpMethods.HelpMethods;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileMethods {
    private int IdCount = 0;
    private final String Language;
    private final String Parameters;
    private final String text;
    private String path = "E:\\JAVA\\Java\\Laboratory\\src\\File\\GenerateTextStore.txt";

    public FileMethods(String text) {
        this.text = text;
        this.Language = "en";
        this.Parameters = "p-2-s-5-7-w-7-9-l-7-9";
    }

    public FileMethods(String Language, String Parameters, String text){
        this.Language = Language;
        this.Parameters = Parameters;
        this.text = text;
    }

    public void CreateFile() {
        try {
            File myObj;
            myObj = new File(path);
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

    public void WriteFile() {
        try {
            ReadFile();
            FileWriter myWriter = new FileWriter(path,true);
            myWriter.write("\n\n\n\n\n");
            myWriter.write("Id = "+IdCount+"\n");
            myWriter.write("Language = "+Language+"\n");
            myWriter.write("Parameters = "+ Parameters +"\n");
            myWriter.write("text = "+ text);
            myWriter.write("END");
            myWriter.close();

            ModifyFile("IdCount",IdCount+1);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void ReadFile(){
        try {
            BufferedReader buffread = new BufferedReader(new FileReader(path));
            String line = buffread.readLine();
            IdCount = Integer.parseInt(HelpMethods.SplitString(line, " = ").get(1).toString());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void ModifyFile(String text,int value) {
        try {
            ArrayList<String> fileContent = new ArrayList<String>(Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8));

            for (int i = 0; i < fileContent.size(); i++) {
                if (fileContent.get(i).startsWith(text)) {
                    fileContent.set(i,text+" = "+value);
                    break;
                }
            }
            Files.write(Paths.get(path), fileContent, StandardCharsets.UTF_8);
            System.out.println("IdCount changed");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
