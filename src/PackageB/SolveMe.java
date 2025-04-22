package PackageB;

import java.util.Arrays;

public class SolveMe {

    //4) In array {34,0,9,5,7,4,0,4,0,23} shift all the 0s to the front using this single array.
    // You are not allowed to use another array or list
    int count = 0;

    public static void shiftZeroToFront(int ar[]){

        int n=ar.length;
        int index=n-1;

        for(int i=n-1;i>=0;i--){
            if(ar[i]!=0){
                ar[index]=ar[i];
                index--;
            }
        }

        for(int j=0;j<=index;j++){
            ar[j]=0;
        }

        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        int ar[] = {34,0,9,5,7,4,0,4,0,23};
        shiftZeroToFront(ar);
    }
}
