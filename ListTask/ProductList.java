package Task1;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> productList = new ArrayList<>();

    public void addNewProduct(Product product) {
        productList.add(product);
    }

    public boolean deleteProductList(Product product) {
        return productList.remove(product);
    }
    public void showProductList() {
        for (Product product : productList) {
            System.out.println("Номер товара - "+productList.indexOf(product)+" Товар - "+ product.getName());
        }
    }
}