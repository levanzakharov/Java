import java.util.Random;

public class A {
    private static int a;
    private static int b;
    private static int[] m = new int[12];

    private static void Method1() {
        int range = 25 - 10 + 1;

        Random rn = new Random();
        a =  rn.nextInt(range) + 10;

        Random rn1 = new Random();
        b =  rn1.nextInt(range) + 10;
    }

    private static int[] Method2() {
        return new int[] {a, b};
    }

    private static int[] Method3() {
        return new int[] {a, b};
    }

    private static void Method4() {
        int i;
        int range = 60 - (-10) + 1;
        for (i=0;i<12;i++){
           Random rn = new Random();
           m[i] =  rn.nextInt(range) + 10;
        }
    }
    private static void Method5() {
        int i;
        for (i=0;i<12;i++){
            if (i%2==0){
                System.out.println(m[i]);
            }
        }
    }
    private static void Method6() {
        int c = 0;
        int i;
        for (i=0;i<12;i++){
            if (m[i]>0){
                c+=m[i];
            }
        }

        System.out.println("m masivi dadebiti elementebis jami: "+c);
    }
    private static void Method7() {
        int min = 100;
        int i;
        for (i=0;i<12;i++){
            if (m[i]>0){
                if (m[i] < min){
                    min = m[i];
                }
            }
        }

        System.out.println("m masivi dadebiti elementebs shoris min: "+min);
    }

    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
        Method4();
        Method5();
        Method6();
        Method7();
    }

}
