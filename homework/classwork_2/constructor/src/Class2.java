public class Class2 {
    int x;

    Class2(){}

    Class2(int x){
        this.x = x;
    }

    public void Method1( int x){
        if (x > 4 && x <25 ){
            System.out.println("x = "+x);
            System.out.println("x is in range [5;24]");
        }
        else {
            System.out.println("x = "+x);
            System.out.println("x is not in range [5;24]");
        }
    }
}
