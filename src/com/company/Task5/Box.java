package com.company.Task5;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private int sizeBox;
    private int freeBox;
    private int sizeProduct = 0;
    private int priceProduct = 0;
    private List<Product> productList = new ArrayList<>();

    public Box(int sizeBox) {
        this.sizeBox = sizeBox;
        this.freeBox = sizeBox;
    }

    public List<Product> getProductList() { return productList; }

    public int getPriceProduct() { return priceProduct; }

    public int getSizeProduct() { return sizeProduct; }

    public boolean verificationProduct(Product product) {
        if (this.freeBox >= product.getDimension()) {
            this.freeBox -= product.getDimension();
            this.productList.add(product);
            sizeProduct = sizeProduct + product.getDimension();
            priceProduct = priceProduct + product.getPrice();
        }
        if (this.freeBox == 0) return false;
        return true;
    }

}
