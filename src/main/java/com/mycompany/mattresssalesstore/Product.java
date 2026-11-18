/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesstore;

/**
 *
 * @author Student
 */

interface IProducts { 

    int getTotalSales(); 
    double getAverageSales(); 
    String getMostPopularProduct(); 

} 

public class Product implements IProducts { 

    private String[] productNames; 
    private int[][] salesData; 

    public Product(String[] productNames, int[][] salesData) { 

        this.productNames = productNames; 
        this.salesData = salesData; 

    } 

    @Override 

    public int getTotalSales() { 
        int total = 0; 
        for(int i = 0; i < salesData.length; i++) { 
            for (int j = 0; j < salesData[i].length; j++) { 
                total += salesData[i][j]; 
            } 
        } 
        return total; 
    } 

    @Override 
    public double getAverageSales() { 
        int total = getTotalSales(); 
        int totalEntries = salesData.length * salesData[0].length; 
        return (double) total / totalEntries; 
    } 

    @Override 

    public String getMostPopularProduct() { 
        int maxSales = -1; 
        int maxIndex = 0; 

        for (int i = 0; i < productNames.length; i++) { 
            int productTotal = 0; 
            for (int j = 0; j < salesData[i].length; j++) { 
                productTotal += salesData[i][j]; 
            } 

            if (productTotal > maxSales) { 
                maxSales = productTotal; 
                maxIndex = i; 
            } 
        } 
        return productNames[maxIndex] + " (" + maxSales + ")"; 
    } 
} 
