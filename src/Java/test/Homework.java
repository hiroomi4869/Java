package test;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] i = {1, 4, 7, 2, 5, 8, 3, 6, 9};
        Sort sort = new Sort(i);
//        Arrays.sort();
        System.out.println(Arrays.toString(i));
    }
}

/** Week one homework.
 * @author Hiroomi
 * @version 1.1
 */

class Sort{
    /**
     * Overload to int long float double
     * @param arr The array you want sort.
     */
    public Sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int low = 0, high = i - 1;
            int mid;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (arr[mid] > temp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for(int j = i - 1; j >= low; j--) {
                arr[j + 1] = arr[j];
            }
            arr[low] = temp;
        }
    }
    public Sort(long[] arr){
        for (int i = 1; i < arr.length; i++) {
            long temp = arr[i];
            int low = 0, high = i - 1;
            int mid;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (arr[mid] > temp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for(int j = i - 1; j >= low; j--) {
                arr[j + 1] = arr[j];
            }
            arr[low] = temp;
        }
    }
    public Sort(float[] arr){
        for (int i = 1; i < arr.length; i++) {
            float temp = arr[i];
            int low = 0, high = i - 1;
            int mid;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (arr[mid] > temp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for(int j = i - 1; j >= low; j--) {
                arr[j + 1] = arr[j];
            }
            arr[low] = temp;
        }
    }
    public Sort(double[] arr){
        for (int i = 1; i < arr.length; i++) {
            double temp = arr[i];
            int low = 0, high = i - 1;
            int mid;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (arr[mid] > temp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for(int j = i - 1; j >= low; j--) {
                arr[j + 1] = arr[j];
            }
            arr[low] = temp;
        }
    }
}