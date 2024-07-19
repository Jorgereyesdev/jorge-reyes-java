package semana3.ejerciciosPOO;

public class StockProducts {
    private String productName;
    private String description;
    private int quantity;

    public StockProducts(String productName, String description, int quantity) {
        this.productName = productName;
        this.description = description;
        this.quantity = quantity;
    }

    public void seeProductQuantity(int quantity) {
        System.out.println("The current quantity of " + productName + " is: " + quantity);
    }

    public void updateProductQuantity(int quantity) {
        this.quantity += quantity;
        System.out.println("The new quantity of " + productName + " is: " + quantity);
    }

    public void decreaseProductQuantity(int quantity) {
        this.quantity -= quantity;
        System.out.println("The new quantity of " + productName + " is: " + quantity);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        StockProducts product1 = new StockProducts("Papaya","Papaya puesta, papaya partida", 10);
        product1.seeProductQuantity(product1.getQuantity());

        product1.updateProductQuantity(5);

        product1.decreaseProductQuantity(2);
    }
}
