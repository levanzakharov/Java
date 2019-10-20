import java.util.Scanner;

public class B extends A {

    public double MethodB1(int x,int y){
        return (y-x)/3;
    }

    public double MethodB2(int x,int y){
        return (Math.pow(x,2)+2*y)/5;
    }

    public void MethodB3(int x) {
        System.out.println("x = " + x);
    }
}
