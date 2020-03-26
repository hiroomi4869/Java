package test;

import java.util.Arrays;

/** Week two homework.
 * @author Hiroomi Shin
 * @version 1.0
 */

public class Homework2 {

    public static void main(String[] args) {
        int arr1[]={1,4,7,2,5,8,3,6,9};
        int arr2[]={90,80,70,60,50,40,30,20,10};
        int []out=method(arr1,arr2);
        System.out.println(Arrays.toString(out));
    }

    /**
     * @param arr1 The first array you want to splice.
     * @param arr2 The second array you want to splice.
     * @return The spliced array.
     */
    static int[] method(int[] arr1,int[] arr2){
        int[] out = new int[(arr1.length+arr2.length)];
        int i=0;
        for (int temp:arr1) {
            out[i]=temp;
            i++;
        }
        for (int temp:arr2) {
            out[i]=temp;
            i++;
        }
        return out;
    }

}
