package entities;

public class Product {
    private final String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        setPrice(price);
    }

    //GETTERS E SETTERS
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
