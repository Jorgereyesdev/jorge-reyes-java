package semana3.ejerciciosPOO2.inventoryControl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private ArrayList<SpecificProduct> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public  Inventory(ArrayList<SpecificProduct> products) {
        this.products = products;
    }

    public void addProduct(SpecificProduct product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        for (SpecificProduct product : products) {
            if (product.getId() == productId) {
                products.remove(product);
                return;
            }
        }
    }
//    public void removeProduct(int productId) {
//        Iterator<SpecificProduct> iterator = products.iterator();
//        while (iterator.hasNext()) {
//            SpecificProduct product = iterator.next();
//            if (product.getId() == productId) {
//                iterator.remove();
//                return;
//            }
//        }
//    }


    public void productList() {
        for (SpecificProduct product : products) {
            System.out.println(product);
        }
    }

    public List<SpecificProduct> searchByName(String name) {
        ArrayList<SpecificProduct> foundProducts = new ArrayList<>();
        for (SpecificProduct product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }

    public List<SpecificProduct> searchByCategory(String brand) {
        ArrayList<SpecificProduct> foundProducts = new ArrayList<>();
        for (SpecificProduct product : products) {
            if (product.getBrand().equalsIgnoreCase(brand)) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new SpecificProduct(1, "Laptop", 1200.0f, "Electronics", "Apple"));
        inventory.addProduct(new SpecificProduct(2, "Phone", 800.0f, "Electronics", "Samsung"));
        inventory.addProduct(new SpecificProduct(3, "Headphones", 50.0f, "Audio", "Sony"));

        System.out.println("Product List:");
        inventory.productList();

        System.out.println("\nSearch by Name:");
        List<SpecificProduct> foundProducts = inventory.searchByName("laptop");
        for (SpecificProduct product : foundProducts) {
            System.out.println(product);
        }

        System.out.println("\nSearch by Brand:");
        foundProducts = inventory.searchByCategory("Sony");
        for (SpecificProduct product : foundProducts) {
            System.out.println(product);
        }

        System.out.println("\nFinal Inventory");
        inventory.removeProduct(2);
        inventory.productList();
    }
}
