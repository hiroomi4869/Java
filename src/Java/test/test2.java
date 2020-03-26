package test;

import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int outPut[][]=new int[10][10];
        int j=0;
        int out=0;
        while (scanner.hasNextInt()){
            int a[] = new int[10];
            int i=0;
            while (scanner.hasNextInt()){
                int b=scanner.nextInt();
                if (b==0||b==-1)break;
                a[i]=b;
                i++;
            }
            outPut[j]=a;
            j++;
            if (outPut[j][0]==-1)break;
        }

//        int x[][] ={{1,2,3,4},{5,6},{7,8,9},{10,11}};
//        for (int x[]:arr) {
//            for (int y:x) {
//                out=out+y;
//            }
//        }
        for (int x[]:outPut) {
            for (int y:x) {
                out=out+y;
            }
        }
        System.out.println(out);
    }
}
