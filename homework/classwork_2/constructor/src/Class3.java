public class Class3 {
    private int a;
    private int b;
    private int x;
    Class3(){}

    Class3(int a,int b){
        this.a = a;
        this.b = b;
    }

    public void Method1( int a, int b){
        if (a!=b){
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            if (a>b){
                System.out.println("Range is ["+b+";"+a+"]");
            }
            else {
                System.out.println("Range is ["+a+";"+b+"]");
            }
        }
        else {
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("There is no range");
        }
    }

    public void Method2( int a, int b,int x){
        if (a!=b){
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("x = "+x);
            if (a>b){
                if (x>b && x<a) {
                    System.out.println("x is in range");
                }
                else {
                    System.out.println("x is not in range");
                }
            }
            else {
                if (x>a && x<b) {
                    System.out.println("x is in range");
                }
                else {
                    System.out.println("x is not in range");
                }
            }
        }
        else {
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("There is no range");
        }
    }
}
