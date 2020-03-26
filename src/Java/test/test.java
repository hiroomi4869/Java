package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        float a,c=0;
        Scanner zhouxin=new Scanner(System.in);

        while(zhouxin.hasNextFloat())
        {
            a=zhouxin.nextFloat();
            c=c+a;
        }
        System.out.println(c);
    }
}
