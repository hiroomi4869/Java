package test;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        int arr[]={1,0,0,4,7,2,0,0,5,8,0,0,3,6,0,9};
        System.out.println(Arrays.toString(method(arr)));
    }

    static int[] method(int inPut[]){

        int length=0;
        for (int temp:inPut) {
            if (temp!=0){
                length++;
            }
        }
        int out[]=new int[length];
        int i=0;
        for (int temp:inPut) {
            if (temp!=0){
                out[i]=temp;
                i++;
            }
        }
        return out;
    }
}
