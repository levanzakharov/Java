import java.util.Random;

interface ClassA {
    void Method1(int a,int b);
    void Method2(int a);
    void Method3(int b);
    String Method4(int b);

}

public class A implements ClassA {
    private static int a = 2733;
    private static int b = 2744;

    @Override
    public void Method1(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);

        for (int i=min+1; i<max;i++){
            System.out.println(i);
        }
    }

    @Override
    public void Method2(int a) {
        int i;
        for (i=1; i<=a;i++){
            if (a%i==0){
                System.out.println("Method2: "+i);
            }
        }
    }

    @Override
    public void Method3(int b) {
        int count = 0;
        for (int i=1; i<=b;i++){
            if (b%i==0){
                count = 0;
                for (int j=1; j<=i;j++){
                    if (i%j==0){
                        count +=1;
                    }
                }

                if (count == 2){
                    System.out.println("Method3: "+i);
                }

            }
        }
    }

    @Override
    public String Method4(int b) {
        String str =Integer.toString(b);

        char[] array = str.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];
        for(int i = 0, j = 0; i < str.length() - 1; i = j){
            int count = 1;
            while (++j < str.length() && array[i] == array[j]) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = array[i];
            }
        }
        return ("\""+maxChar + "\" = " + maxCount);
    }


    public static void main(String[] args) {
        A obj = new A();
        obj.Method1(a,b);
        obj.Method2(a);
        obj.Method3(b);
        System.out.println(obj.Method4(b));
    }

}
