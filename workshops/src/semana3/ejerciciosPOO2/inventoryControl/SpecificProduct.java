package semana3.ejerciciosPOO2.inventoryControl;

public class SpecificProduct extends Product {

    private String category;
    private String brand;

    public SpecificProduct(int id, String name, Float price, String category, String brand) {
        super(id, name, price);
        this.category = category;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SpecificProduct{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
