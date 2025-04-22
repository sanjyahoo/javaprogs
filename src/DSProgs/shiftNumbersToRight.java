package DSProgs;

import java.util.Arrays;

public class shiftNumbersToRight {
    public static int[] shiftArrayNumbs(int a[]){
            int count = a.length-1;
            for (int i = a.length-1; i >=0; i--) {
                if (a[i] != 0) {
                    a[count] = a[i];
                    count--;
                }
            }
        for (int j = 0; j <= count; j++) {
            a[j] = 0;
        }

    return a;
    }


    public static void main(String[] args) {
        int a[] = {1, 3, 0, 4, 0, 0, 7, 3};
        System.out.println(Arrays.toString(shiftArrayNumbs(a)));
    }

}
