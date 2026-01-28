package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Product product, Double price, Integer quantity){
        setQuantity(quantity);
        setPrice(price);
        setProduct(product);
    }

    @Override
    public String toString() {
        return getProduct().getName() + ", Quantity: " + getQuantity() + ", Subtotal: $" + String.format("%.2f", subTotal()) + "\n";
    }

    //METODO PARA CALCULAR PREÇO TOTAL DO PEDIDO
    public Double subTotal(){
        return getProduct().getPrice() * quantity;
    }

    //GETTERS E SETTERS
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
