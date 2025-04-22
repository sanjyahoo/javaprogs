package DSProgs;

import java.util.Arrays;

class MoveZeros{
    static void moveZerosToLeft(int[] array) {

        int count = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[count] = array[i];
                count--;
            }
        }


        while (count >= 0) {
            array[count] = 0;
            count--;
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] v = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
        System.out.println("Original Array: " + Arrays.toString(v));

        moveZerosToLeft(v);

        System.out.println("After Moving Zeroes to Left: " + Arrays.toString(v));
    }
}
