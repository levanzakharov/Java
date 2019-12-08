import File.FileMethods;
import GenerateText.GenerateText;
import UserConsole.UserConsole;

import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {

    public static void main(String[] args) {
        UserConsole.StartText();
        String[] Values = UserConsole.GetValues();

        if (Values[0].equals("") & Values[1].equals("")) {
            GenerateText obj = new GenerateText();
            String[] Result = obj.GenerateTextMethod();
            FileMethods obj1 = new FileMethods(Result[0]);
            obj1.CreateFile();
            obj1.WriteFile();
        }
        else if(!Values[0].equals("") & !Values[1].equals("")){
            GenerateText obj = new GenerateText(Values[0],Values[1]);
            if (obj.CheckValues()){
                String[] Result = obj.GenerateTextMethod();
                FileMethods obj1 = new FileMethods(Result[0],Result[1],Result[2]);
                obj1.CreateFile();
                obj1.WriteFile();
            }
            else {
                System.out.println("\nPlease Enter Values Correctly\n");
            }

        }
        else{
            System.out.println("\nPlease Enter Values Correctly!!!\n");
        }
    }
}
