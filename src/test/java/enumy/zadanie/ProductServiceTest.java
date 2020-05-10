package enumy.zadanie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    private ProductService productService;

    @BeforeEach
    void setUp() {
        Product product = new Product("jablko", 50.0, 1, ProductType.OWOCE);
        Product product1 = new Product("gruszka", 50.0, 1, ProductType.OWOCE);
        Product product2 = new Product("kurczak", 50.0, 1, ProductType.MIESO);
        Product product3 = new Product("marchewka", 50.0, 1, ProductType.WARZYWA);
        List<Product> products = Arrays.asList(product, product1, product2, product3);
        productService = new ProductService(products);

    }

    @Test
    void testWhenRetrievingFruitsThenGetFruits() {
        List<Product> owoce = productService.retrieveFruits();

        for (Product product : owoce) {
//           System.out.println(product.getProductType() + " " +product.getName());
            assertEquals(ProductType.OWOCE, product.getProductType());
        }

    }
}
