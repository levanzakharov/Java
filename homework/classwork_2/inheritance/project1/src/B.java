import java.util.Scanner;

public class B extends A {
    private static int x;
    private static int y;

    public int MethodB1(){
        System.out.println("y = ");
        Scanner scan = new Scanner(System.in);
        String sc= scan.nextLine();
        y = Integer.parseInt(sc);
        return y;
    }

    public int MethodB2(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        B obj = new B();
        x = obj.Method1();
        obj.Method2(x);
        obj.Method3(x);
        y = obj.MethodB1();
        System.out.println(obj.MethodB2(x,y));

    }
}
