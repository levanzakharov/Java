import java.util.Scanner;

public class A {
    int x;
    A(){
        System.out.println("hello My A Class");
    }

    public int Method1(){
        System.out.println("x = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        x = Integer.parseInt(sc);
        return x;
    }

    public void Method2(int x){
        System.out.println("x = "+x);
    }

    public void Method3(int x){
        if (x%2==0){
            System.out.println("x is even");
        }
        else {
            System.out.println("x is odd");
        }
    }


}
