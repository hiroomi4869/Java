package Week3;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point1 =new Point(1,2);
        System.out.println(point1.getDis());
        point1.moveTo(12,6);
        System.out.println("Type "+point1.getClass()+" is move to ("+point1.getX()+","+point1.getY()+").");

        Class p=point1.getClass();
        Field[] fields1=p.getDeclaredFields();
        for (Field f:fields1) {
            System.out.println(f.getName());
        }
    }
}
