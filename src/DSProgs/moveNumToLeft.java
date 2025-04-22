package DSProgs;

import java.util.Arrays;

public class moveNumToLeft {
    static int[] shiftNum(int arr[]){
        int count =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }

        for (int j=count;j<arr.length;j++){
            arr[j]=0;
        }


        return arr;

    }

    public static void main(String[] args) {
        int[] ar = {1,3,0,0,0,9,0,0,0,8,9,7};
        System.out.println(Arrays.toString(shiftNum(ar)));
    }
}
