import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Input extends Thread {
    private String path="E:\\JAVA\\Java\\Masala\\src";

    //input
    public int[] Method1() {
        Scanner scan = new Scanner(System.in);

        System.out.println("a = ");
        int a = scan.nextInt();
        System.out.println("Method1: a = "+a);

        System.out.println("b = ");
        int b = scan.nextInt();
        System.out.println("Method1: b = "+b);

        return new int[] {a, b};
    }

    //arraylist
    public void Method2(){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String car : cars) {
            System.out.println(car);
        }
        cars.contains("volvo");
        cars.indexOf("ragaca");
        cars.get(0);
        cars.set(0, "Opel");
        cars.remove(0);
        cars.clear();
    }

    //list
    public void Method3(){
        String[] cars = new String[4];
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Mazda";
    }

    //RandomInt
    public static int RandomInt(int From, int To)
    {
        Random r = new Random();
        return r.nextInt((Math.max(From,To) - Math.min(From,To)) + 1) + Math.min(From,To);
    }

    //RandomDouble
    public static double RandomDouble(int From, int To)
    {
        Random r = new Random();
        return Math.min(From,To) + (Math.max(From,To) - Math.min(From,To)) * r.nextDouble();
    }

    //Conversion
    public static void Method5(){
        //String to int
        int x = Integer.parseInt(String.valueOf("21345"));

        //int to string
        int a = 39;
        String number = Integer.toString(a);
    }

    //CountLetter
    public static int CountLetter(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)  == '-')
                count++;
        }
        return count;
    }

    //Split String
    public static ArrayList SplitString(String text,String splitValue){
        String[] str = text.split(splitValue);
        return new ArrayList<>(Arrays.asList(str));
    }

    //isNumber
    public static Boolean isNumber(String text){
        return text.matches("[0-9]+");
    }

    //CreateFile
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

    //writeFile
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

    //ModifyFile
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

    //thread
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
    public void Main(){
//        ThreadOne t1 = new ThreadOne("Thread 1.1",5);
//        ThreadOne t2 = new ThreadOne("Thread 1.2",5);
//
//        t1.start();
//        t2.start();
//
//        t1.setPriority(3);
//        t2.setPriority(9);
//
//        try {
//            Thread.sleep(200);
//        }
//        catch (InterruptedException ex){
//            ex.printStackTrace();
//        }
    }

}
