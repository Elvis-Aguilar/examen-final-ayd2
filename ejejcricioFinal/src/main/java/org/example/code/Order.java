package org.example.code;

import java.util.List;

public class Order {
    private String customerName;
    private List<String> items;
    private double total;

    public void printOrderSummary() {
        ReportGenerator generator = new ReportGenerator();
        generator.printHeader(customerName);
        for (String item : items) {
            generator.printLineItem(item);
        }
        generator.printTotal(total);
    }
}
