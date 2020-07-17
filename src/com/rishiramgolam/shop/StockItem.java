package com.rishiramgolam.shop;

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private int quantityStock = 0;
    private double price;

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.quantityStock = quantityStock;
        this.price = price;
    }

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    public String getName() {
        return name;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj.getClass() != this.getClass() || obj == null) return false;

        String objName = ((StockItem) obj).getName();

        return this.getName().equals(objName);
    }

    @Override
    public int compareTo(StockItem o) {
        if (this == o) return 0;

        if (o != null) return this.getName().compareTo(o.getName());

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.getName() + " : price " + this.getPrice();
    }
}
