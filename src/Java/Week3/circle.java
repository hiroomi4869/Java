package Week3;


public class circle {
    private double r;
    private double area;


    public circle(double a){
        r=a;
        area=3.14*a*a;
    }

    double computArea(){
        double s=3.14*r*r;
        return s;
    }

    double computzhou(){
        double s=2*3.14*r;
        return s;
    }


}
