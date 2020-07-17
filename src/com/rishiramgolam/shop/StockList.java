package com.rishiramgolam.shop;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = list.getOrDefault(item.getName(), item);

            if (inStock != item) {
                item.adjustStock(inStock.getQuantityStock());
            }
            list.put(item.getName(), item);
            return  item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String itemName, int number) {
        if (itemName != null) {
            StockItem currentInStock = list.getOrDefault(itemName, null);

            if ((currentInStock != null) && (currentInStock.getQuantityStock() >= number) && (number > 0)) {
                currentInStock.adjustStock(-number);
                return number;
            }
        }
        return 0;
    }

    public StockItem get(String itemName) {
        return list.get(itemName);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\n Stock List \n";
        double totalPrice = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getQuantityStock();
            s += stockItem + ". There are " + stockItem.getQuantityStock() + " in stock. Value of items: ";
            s += String.format("%.2f", itemValue) + "\n";
            totalPrice += itemValue;
        }

        return s + "Total stock value: " + totalPrice;
    }
}
