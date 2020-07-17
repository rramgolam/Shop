package com.rishiramgolam.shop;

public class Main {

    public static StockList stocklist = new StockList();
    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stocklist.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stocklist.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stocklist.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stocklist.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stocklist.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stocklist.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stocklist.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stocklist.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stocklist.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stocklist.addStock(temp);

        System.out.println(stocklist);
    }
}
