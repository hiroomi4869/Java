package test;

public class Yihuo {
    public static void main(String[] args) {
        int []arr={1,2,4,5,7,9,34,67,89,34,67,89,12,30,12,30,65,90,123,456,789,1,2,4,5,7,9,65,90,123,456};
        int out=0;
        for (int temp:arr) {
            out=out^temp;
        }
        System.out.println(out);
    }
}
