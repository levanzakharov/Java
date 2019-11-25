package File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileMethods {
    public void CreateFile() {
        try {
            File myObj;
            myObj = new File("E:\\JAVA\\Java\\homework\\classwork_5\\src\\File\\Currency.txt");
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

    public void WriteFile(String CurrencyName, float CurrencyValue) {
        try {
            String filename= "E:\\JAVA\\Java\\homework\\classwork_5\\src\\File\\Currency.txt";
            FileWriter myWriter = new FileWriter(filename,true); //the true will append the new data
            myWriter.write(CurrencyName+"="+CurrencyValue+"\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void ReadFile(){
        try {
            ArrayList<String> fileContent = new ArrayList<String>(Files.readAllLines(Paths.get("E:\\JAVA\\Java\\homework\\classwork_5\\src\\File\\Currency.txt"), StandardCharsets.UTF_8));
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void ModifyFile(String changeCurrencyName,float changeCurrencyValue) throws IOException {
        try {
            ArrayList<String> fileContent = new ArrayList<String>(Files.readAllLines(Paths.get("E:\\JAVA\\Java\\homework\\classwork_5\\src\\File\\Currency.txt"), StandardCharsets.UTF_8));

            for (int i = 0; i < fileContent.size(); i++) {
                if (fileContent.get(i).startsWith(changeCurrencyName)) {
                    fileContent.set(i,changeCurrencyName+" = "+changeCurrencyValue);
                    break;
                }
            }
            Files.write(Paths.get("E:\\JAVA\\Java\\homework\\classwork_5\\src\\File\\Currency.txt"), fileContent, StandardCharsets.UTF_8);
            System.out.println("Course changed");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
