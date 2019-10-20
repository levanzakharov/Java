public class C extends B {
    private static double z;

    public double MethodC1(int x,int y,double z){
        return (x+y+z)/3;
    }

    public double MethodC2(int x,int y,double z){
        return Math.pow((x*y*z),1/3);
    }

    public double MethodC3(int x,int y,double z){
        return Math.max(x,Math.max(y,z));
    }

    public static void main(String[] args) {
        C obj = new C();
        int[] array = obj.MethodA1();
        obj.MethodA2(array[0]);
        obj.MethodA3(array[1]);

        System.out.println(obj.MethodB1(array[0],array[1]));
        System.out.println(obj.MethodB2(array[0],array[1]));

        z = 6;
        System.out.println(obj.MethodC1(array[0],array[1],z));
        System.out.println(obj.MethodC2(array[0],array[1],z));
        System.out.println(obj.MethodC3(array[0],array[1],z));
    }
}
