package Week3.Homework;

/** Week three homework.
 * @author Hiroomi Shin
 * @version 1.1
 */
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Square s1 = new Square(1,2,3,4);
        System.out.println(c1.toString());
        System.out.println(s1.toString());
    }

    static class Circle {
        private int r;
        private int x;
        private int y;
        private double area;

        public final double pi=3.1415926535;

        public Circle(int r) {
            this(r,0,0);
        }

        public Circle(int r, int x, int y) {
            this.r = r;
            this.x = x;
            this.y = y;
            area=pi*r*r;
        }

        public int getR() {
            return r;
        }

        public double getArea() {
            return area;
        }
        public int[] getPosition(){
            int[] ints={x,y};
            return ints;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "r=" + r +
                    ", x=" + x +
                    ", y=" + y +
                    ", area=" + area +
                    '}';
        }
    }

    static class Square {
        private int length;
        private int width;
        private int area;
        private int x;
        private int y;

        public Square(int length, int width) {
            this(length,width,0,0);
        }

        public Square(int length, int width, int x, int y) {
            this.length = length;
            this.width = width;
            this.x = x;
            this.y = y;
            area=length*width;
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        public int getArea() {
            return area;
        }

        public int[] getPosition(){
            int [] ints={x,y};
            return ints;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "length=" + length +
                    ", width=" + width +
                    ", area=" + area +
                    ", x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

}



