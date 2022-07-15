package Estore;


import java.util.ArrayList;

public class Product {
    private String productName;
    private int productId;
    private double productPrice;
    private String productDescription;
    private ArrayList<ProductCategory> myCategory = new ArrayList();

    public Product(String productName, int productId, double productPrice, String productDescription) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        myCategory = new ArrayList();
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }


    public ArrayList getProductCategory() {
        return myCategory;
    }
}
