package Gau;

import java.util.Scanner;

public class Main1 extends TestStudent {
    public static void main(String[] args) {
        TestStudent student1 = new TestStudent();
        student1.name = "Beqa";
        student1.lastName = "arabidze";
        student1.course = 3;
        Scanner scanner = new Scanner(System.in);
        int age;
        age = scanner.nextline();
        student1.SetAge(age);
        student1.printData();

        TestStudent student2 = new TestStudent();
        student2.name = "Saba";
        student2.lastName = "kevlishvili";
        student2.course = 3;
        student2.printData();

        magistrati m1 = new magistrati();
        m1.name = "robo";
        m1.lastName = "sokhashvili";
        m1.course = 2;
    }


}
