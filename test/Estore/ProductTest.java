package Estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {
    Product product;

    @BeforeEach
    void setUp() {
        product = new Product("Corn Flakes", 001, 10.0, "Cereal");
    }
    @Test
    void productNameCanBeTested(){
        assertEquals("Corn Flakes", product.getProductName());
    }

    @Test
    void productiDCanBeTested(){
        assertEquals(001, product.getProductId());
    }

    @Test
    void productPriceCanBeTested(){
        assertEquals(10.0, product.getProductPrice());
    }
    @Test
    void productDescriptionCanBeTested(){
        assertEquals("Cereal", product.getProductDescription());
    }
//    @Test
//    void productCategoryCanBeTested(){
//        assertSame(ProductCategory.Electronics, product.getProductCategory());
//    }


}