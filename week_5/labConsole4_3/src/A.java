import java.util.Random;

public class A {
    private static int a = 2733;
    private static int b = 2744;

    private static void Method1() {
        int max;
        if (a>b){
            max = a;
        }
        else {
            max = b;
        }
        int i;
        for (i=1; i<max;i++){
            if ((a+i)<b){
                System.out.println(a+i);
            }
        }
    }

    private static void Method2() {
        int i;
        for (i=1; i<a+1;i++){
            if (a%i==0){
                System.out.println(i);
            }
        }
    }

    private static void Method3() {
        int i;
        for (i=1; i<b;i++){
            if (a%i==0){

                int j;
                int count = 0;
                for (j=1; j<i;j++){
                    if (a%i==0){
                        count +=1;
                    }
                }

                if (count == 2){
                    System.out.println(i);
                }

            }
        }
    }

    private static void Method4() {
        String str =Integer.toString(b);

        int i;
        int count = 0;
        int maxcount = 0;
        for (i=0; i<str.length();i++){
            if (count>maxcount){
                maxcount = count;
            }
            count =0;

            char toCheck = str.charAt(i);
            for (char ch: str.toCharArray()) {
                if (ch == toCheck) {
                    count++;
                }
            }

        }
        System.out.println(maxcount);


    }

    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();
        Method4();

    }

}
