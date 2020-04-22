package tools;

public class Point {
    private Integer x;
    private Integer y;
    public Double dis;
    private static int num=0;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        dis=Math.sqrt(x*x+y*y);
    }

    public void move(int x,int y){
        this.x+=x;
        this.y+=y;
    }

    public void moveTo(int x,int y){
        this.x=x;
        this.y=y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Double getDis() {
        dis=Math.sqrt(x*x+y*y);
        return dis;
    }


}
