import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class main2 {
    public static void main(String[] args) {
        Exercise();

    }

    static void Exercise() {
        Scanner ex = new Scanner(System.in);
        System.out.println("Enter exercise number:");
        String exercise = ex.nextLine();

        if (exercise.equals("1")){
            Exercise1();
        }

        if (exercise.equals("2")){
            Exercise2();
        }

        if (exercise.equals("3")){
            Exercise3();
        }

        if (exercise.equals("4")){
            Exercise4();
        }

        if (exercise.equals("5")){
            Exercise5();
        }

        if (exercise.equals("6")){
            Exercise6();
        }

        if (exercise.equals("7")){
            Exercise7();
        }

        if (exercise.equals("8")){
            Exercise8();
        }

        if (exercise.equals("9")){
            Exercise9();
        }

        if (exercise.equals("10")){
            Exercise10();
        }

        if (exercise.equals("11")){
            Exercise11();
        }

        if (exercise.equals("12")){
            Exercise12();
        }
    }

    private static void Exercise1() {
        String[] pr_ln = {"C++", "C#", "java", "pascal", "php", "JavaScropt", "ActionScript"};

        System.out.println("Enter exercise number:");

        for (int i = 0; i<pr_ln.length; i++){
            System.out.println(i+") "+pr_ln[i]);
        }
    }

    private static void Exercise2() {
        Scanner Fn = new Scanner(System.in);
        System.out.println("Enter first number:");
        String fns = Fn.nextLine();
        int fn = Integer.parseInt(fns);

        Scanner Sn = new Scanner(System.in);
        System.out.println("Enter second number:");
        String sns = Sn.nextLine();
        int sn = Integer.parseInt(sns);

        int fs = fn%sn;
        int sf = sn%fn;

        System.out.println("first / second = "+fs);
        System.out.println("second / first = "+sf);

    }

    private static void Exercise3() {
        Scanner Fn = new Scanner(System.in);
        System.out.println("Enter first number:");
        String fns = Fn.nextLine();
        int fn = Integer.parseInt(fns);

        Scanner Sn = new Scanner(System.in);
        System.out.println("Enter second number:");
        String sns = Sn.nextLine();
        int sn = Integer.parseInt(sns);

        Scanner Tn = new Scanner(System.in);
        System.out.println("Enter third number:");
        String tns = Tn.nextLine();
        int tn = Integer.parseInt(tns);

        int sum = fn+sn+tn;
        int pro = sn*fn*tn;

        System.out.println("sum = "+sum);
        System.out.println("product = "+pro);

    }

    private static void Exercise4() {
        Scanner Fn = new Scanner(System.in);
        System.out.println("Enter 3 digit number:");
        String fns = Fn.nextLine();

        if (fns.matches("^[0-9]*$") && fns.length() == 3) {
            for (int i = 0; i<3; i++){
                System.out.println(fns.charAt(i));
            }
        }
        else {
            System.out.println("incorrect number");
        }

    }

    private static void Exercise5() {
        Scanner Fn = new Scanner(System.in);
        System.out.println("Enter 4 digit number:");
        String fns = Fn.nextLine();

        if (fns.matches("^[0-9]*$") && fns.length() == 4) {
            int sum = 0;
            for (int i = 0; i<4; i++){
                int fn = Integer.parseInt(String.valueOf(fns.charAt(i)));
                sum += fn;
            }

            System.out.println(sum);
        }
        else {
            System.out.println("incorrect number");
        }
    }

    private static void Exercise6() {
        Scanner Fn = new Scanner(System.in);
        System.out.println("Enter number:");
        String fns = Fn.nextLine();

        if (fns.matches("^[0-9]*$")) {
            int sum = 0;
            for (int i = 0; i<fns.length(); i++){
                int fn = Integer.parseInt(String.valueOf(fns.charAt(i)));
                sum += fn;
            }

            System.out.println(sum);
        }
        else {
            System.out.println("incorrect number");
        }
    }

    private static void Exercise7() {
        Scanner Fn = new Scanner(System.in);
        System.out.println("Enter first number:");
        String fns = Fn.nextLine();
        int x = Integer.parseInt(fns);

        Scanner Sn = new Scanner(System.in);
        System.out.println("Enter second number:");
        String sns = Sn.nextLine();
        int y = Integer.parseInt(sns);
        int gcd =  gcd(x, y);
        int LCM = LCM(x,y);
        System.out.println("gcd = "+ gcd);
        System.out.println("LCM = "+ LCM);
    }

    static int gcd(int x, int y)
    {
        if (x == 0)
            return y;
        if (y == 0)
            return x;

        if (x == y)
            return x;

        if (x > y)
            return gcd(x-y, x);
        return gcd(x, y-x);
    }

    public static int LCM(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    private static void Exercise8() {
        Scanner Fn = new Scanner(System.in);
        System.out.println("Enter first number:");
        String fns = Fn.nextLine();
        int M = Integer.parseInt(fns);

        Scanner Sn = new Scanner(System.in);
        System.out.println("Enter second number:");
        String sns = Sn.nextLine();
        int N = Integer.parseInt(sns);

        for (int i = M; i<N; i++){
            System.out.println(i+1);
        }
    }

    private static void Exercise9() {
        double[] numbers = {3.4,2.5,7.87,5.76,1.9,0.12,4.34,7.54};


        System.out.print("Numbers = {");
        for (int i = 0; i<numbers.length; i++){
            if (i==7){
                System.out.print(numbers[i]);
            }
            else {
                System.out.print(numbers[i]+",");
            }
        }
        System.out.print("};");
        System.out.println("");

        Arrays.sort(numbers);
        System.out.println("Max number = "+numbers[7]);
        System.out.println("Min number = "+numbers[0]);
    }

    private static void Exercise10() {
        double[] numbers = {3.4,2.5,7.87,5.76,1.9,0.12,4.34,7.54};
        Arrays.sort(numbers);

        System.out.print("Numbers = {");
        for (int i = 0; i<numbers.length; i++){
            if (i==7){
                System.out.print(numbers[i]);
            }
            else {
                System.out.print(numbers[i]+",");
            }
        }
        System.out.print("};");
        System.out.println("");
    }

    private static void Exercise11() {
        double[] numbers = new double[8];

        for (int i = 0; i<numbers.length; i++){
            double start = 1;
            double end = 20;
            double random = new Random().nextDouble();
            double result = start + (random * (end - start));

            numbers[i] = result;
        }

        System.out.print("Numbers = {");
        for (int i = 0; i<numbers.length; i++){
            if (i==7){
                System.out.print(numbers[i]);
            }
            else {
                System.out.print(numbers[i]+",");
            }
        }
        System.out.print("};");
        System.out.println("");
    }

    private static void Exercise12() {
        double[] numbers = new double[8];

        for (int i = 0; i<numbers.length; i++){
            double start = 1;
            double end = 20;
            double random = new Random().nextDouble();
            double result = start + (random * (end - start));

            numbers[i] = result;
        }

        Arrays.sort(numbers);
        double k = numbers[0];
        numbers[0] = numbers[7];
        numbers[7] = k;
        k = numbers[1];
        numbers[1] = numbers[6];
        numbers[6] = k;
        k = numbers[2];
        numbers[2] = numbers[5];
        numbers[5] = k;
        k = numbers[3];
        numbers[3] = numbers[4];
        numbers[4] = k;

        System.out.print("Numbers = {");
        for (int i = 0; i<numbers.length; i++){
            if (i==7){
                System.out.print(numbers[i]);
            }
            else {
                System.out.print(numbers[i]+",");
            }
        }
        System.out.print("};");
        System.out.println("");
    }


}
