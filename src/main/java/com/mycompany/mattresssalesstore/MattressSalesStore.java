/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesstore;

/**
 *
 * @author Student
 */

import java.util.Scanner;

public class MattressSalesStore { 
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in); 
        
        //array for the product type
        String[] mattressNames = { 
            "Cozy Monarch Mattress", 
            "Restonic Barbados Matttress", 
            "Seally Phuket Mattress" 
        }; 

        //sales data 2d array
        int[][] salesData = new int[3][3]; 

        for (int i = 0; i < mattressNames.length; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print("Enter number of sales for month " + (j + 1) + " " + "for"+ " " + mattressNames[i] + ":"); 
                salesData[i][j] = input.nextInt(); 
            } 
        } 

        Product productReport = new Product(mattressNames, salesData); 
        
        //final output

        System.out.println("\\nPRODUCT SALES REPORT – 2026"); 
        
        System.out.println("****************************************"); 
        System.out.println("TOTAL PRODUCT SALES: " + productReport.getTotalSales()); 
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(productReport.getAverageSales())); 
        System.out.println("MOST POPULAR PRODUCT: " + productReport.getMostPopularProduct()); 

        input.close(); 
    } 
} 

 

 
