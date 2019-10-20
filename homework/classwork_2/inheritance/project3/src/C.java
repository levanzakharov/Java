public class C extends B {
    private static double z;
    private static double r;

    public double MethodC1(int x,int y,double z,double r){
        return Math.max(Math.max(x,y),Math.max(z,r));
    }

    public double MethodC2(int x,int y,double z,double r){
        return (Math.pow(x,2)+2*y)/(z-r);
    }

    public double MethodC3(int x,int y,double z,double r){
        return ( MethodB1(x,y) + (r/(z+4)));
    }

    public static void main(String[] args) {
        C obj = new C();
        //int[] array = obj.MethodA1();
        int[] array = obj.MethodA2();
        obj.MethodA3(array[1]);

        System.out.println(obj.MethodB1(array[0],array[1]));
        System.out.println(obj.MethodB2(array[0],array[1]));
        obj.MethodB3(array[0]);;

        z = 6;
        r = 4;
        System.out.println(obj.MethodC1(array[0],array[1],z,r));
        System.out.println(obj.MethodC2(array[0],array[1],z,r));
        System.out.println(obj.MethodC3(array[0],array[1],z,r));
    }
}
