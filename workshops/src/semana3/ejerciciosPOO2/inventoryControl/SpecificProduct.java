package semana3.ejerciciosPOO2.inventoryControl;

public class SpecificProduct extends Product {

    private String category;
    private String brand;

    public SpecificProduct(int id, String name, Float price, String category, String brand) {
        super(id, name, price);
        this.category = category;
        this.brand = brand;
    }

}
