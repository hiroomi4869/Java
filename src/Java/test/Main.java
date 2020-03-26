package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Float> list = new ArrayList();
        while (scanner.hasNextFloat()){
            list.add(scanner.nextFloat());
        }
        float out=0;
        for (Float alpha:list) {
            out=alpha+out;
        }
        System.out.println(out);
    }
}