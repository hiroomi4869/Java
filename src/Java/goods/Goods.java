package goods;

public class Goods {
    double weight;
    static double cost=10;
    double money;
    public Goods(double weight) {
        this.weight = weight;
        money=weight*cost;
    }
}
