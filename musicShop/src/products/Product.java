package products;

public abstract class Product {
    protected final int id;
    protected double cost;

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, double cost) {
        this.id = id;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
