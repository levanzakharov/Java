package Davaleba;

import java.util.Arrays;
import java.util.Random;

public class Dav5 {
    private static int[] numbers= new int[100];
    private int count;

    public Dav5(){
        RandomRange();
        System.out.println(Arrays.toString(numbers));
        System.out.println(count);
    }

    private void RandomRange() {
        int range = 100;
        count = 0;

        for (int i = 0; i < 100; i++){
            Random rn = new Random();
            int n =  rn.nextInt(range);
            numbers[i] = n;
            if (n>i){
                count++;
            }
        }
    }
}
