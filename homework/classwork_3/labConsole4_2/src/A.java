import java.util.Arrays;
import java.util.Random;

interface ClassA {
    void Method1();
    int[] Method2(int a,int b);
    String[] Method3(int a,int b);
    void Method4();
    void Method5();
    void Method6();
    void Method7();

}

public class A implements ClassA {
    private static int a;
    private static int b;
    private static int[] m = new int[12];


    @Override
    public void Method1() {
        int range = 25 - 10 + 1;

        Random rn = new Random();
        a =  rn.nextInt(range) + 10;

        Random rn1 = new Random();
        b =  rn1.nextInt(range) + 10;
    }

    @Override
    public int[] Method2(int a, int b) {
        return new int[] {a, b};
    }

    @Override
    public String[] Method3(int a, int b) {
        return new String[] {String.valueOf(a), String.valueOf(b)};
    }

    @Override
    public void Method4() {
        int i;
        int range = 60 - (-10) + 1;
        for (i=0;i<m.length;i++){
            Random rn = new Random();
            m[i] =  rn.nextInt(range) + 10;
        }
    }

    @Override
    public void Method5() {
        int i;
        for (i=0;i<m.length;i++){
            if (i%2==0){
                System.out.println(m[i]);
            }
        }
    }

    @Override
    public void Method6() {
        int c = 0;
        int i;
        for (i=0;i<m.length;i++){
            if (m[i]>0){
                c+=m[i];
            }
        }

        System.out.println("m masivi dadebiti elementebis jami: "+c);
    }

    @Override
    public void Method7() {
        Arrays.sort(m);
        System.out.println("m masivi dadebiti elementebs shoris min: "+m[0]);
    }


    public static void main(String[] args) {
        A obj = new A();
        obj.Method1();
        obj.Method2(a,b);
        obj.Method3(a,b);
        obj.Method4();
        obj.Method5();
        obj.Method6();
        obj.Method7();
    }

}
