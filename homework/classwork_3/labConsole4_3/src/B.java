import java.util.Arrays;
import java.util.Random;

interface ClassB {
    int[] Method1(int a,int b);
    void Method2(int a);
    void Method3(int b);
    int Method4(int b);

}

public class B implements ClassB {
    private static int _a = 4;
    private static int _b = 129;


    @Override
    public int[] Method1(int a, int b) {
        int range = Math.max(a,b) - Math.min(a,b) + 1;

        Random rn = new Random();
        int n1 =  rn.nextInt(range) + 10;

        Random rn1 = new Random();
        int n2 =  rn1.nextInt(range) + 10;

        Random rn2 = new Random();
        int n3 =  rn2.nextInt(range) + 10;

        return new int[]{n1,n2,n3};
    }

    @Override
    public void Method2(int a) {
        int range = a - 1 + 1;

        Random rn = new Random();
        int n1 =  (rn.nextInt(range) + 10)*a;
        System.out.println("n1 = "+n1);

        Random rn1 = new Random();
        int n2 =  (rn1.nextInt(range) + 10)*a;
        System.out.println("n2 = "+n2);

        Random rn2 = new Random();
        int n3 =  (rn2.nextInt(range) + 10)*a;
        System.out.println("n3 = "+n3);
    }

    @Override
    public void Method3(int b) {
        int j = 0;
        int length = (int) Math.log10(b);
        int divisor = (int) Math.pow(10, length);
        int[] input = new int[length + 1];

        while (b != 0) {
            input[j] = b / divisor;
            if (j < length) {
                ++j;
            }
            b = b % divisor;
            if (j != 0) {
                divisor = divisor / 10;
            }
        }

        System.out.println(Arrays.toString(input));

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    if (x != y && y != z && z != x) {
                        System.out.println("Method3: "+input[x] + "" + input[y] + "" + input[z]);
                    }
                }
            }
        }
    }

    @Override
    public int Method4(int b) {
        String str =Integer.toString(b);

        int max = 0;
        int x;
        for(int i = 0; i < str.length(); i++){
            char sc= str.charAt(i);
            x = Integer.parseInt(String.valueOf(sc));
            if(max < x){
                max = x;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        B obj = new B();
        System.out.println(Arrays.toString(obj.Method1(_a, _b)));
        obj.Method2(_a);
        obj.Method3(_b);
        System.out.println(obj.Method4(_b));
    }

}
