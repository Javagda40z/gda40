package enumy.zadanie;

import java.util.ArrayList;
import java.util.List;


public class ProductService {

    private final List<Product> products;

    public List<Product> retrieveFruits() {

        List<Product> owoce = new ArrayList<>();

        for (Product product : products) {
            if (ProductType.OWOCE == product.getProductType()) {
                owoce.add(product);
            }
        }


        return owoce;

    }

    public ProductService(List<Product> products) {
        this.products = products;
    }
}
