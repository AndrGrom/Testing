package com.company.Task5;

public class Product {

    private Integer dimension;
    private Integer price;
    private double mean;

    public Product(Integer dimension, Integer price) {
        this.dimension = dimension;
        this.price = price;
        this.mean = getMeanNumber();
    }

    public Integer getDimension() {return dimension;}
    public Integer getPrice() {return price;}
    public double getMean() {return mean;}

    private double getMeanNumber() {
        return (double) this.price / this.dimension;
    }

    @Override
    public String toString() {
        return "Product{" +
                "dimension=" + dimension +
                ", price=" + price +
                ", mean=" + mean +
                '}';
    }

}
