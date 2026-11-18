/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 

 

public class ProductTest { 
    
    @Test 

    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() { 
        String[] productNames = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"}; 

        int[][] salesData = { 

            {25, 18, 20}, 

            {15, 10, 12}, 

            {18, 15, 20} 

        }; 

        Product product = new Product(productNames, salesData); 

        int expectedTotal = 153; // Sum of all values 

        int actualTotal = product.GetTotalProductsSold(); 

        assertEquals(expectedTotal, actualTotal); 

    } 

    @Test 

    public void GetAverageSales_WithValidData_ReturnsCorrectValue() { 
        String[] productNames = {
            "Cozy Nights Monarch mattress", 
            "Restonic Barbados mattress", 
            "Sealy Phuket mattress"}; 

        int[][] salesData = { 
            {25, 18, 20}, 
            {15, 10, 12}, 
            {18, 15, 20} 
        }; 

        Product product = new Product(productNames, salesData); 
        double expectedAverage = 17.0; // 153 / 9 entries 

        double actualAverage = product.GetAverageProductSold(); 
        assertEquals(expectedAverage, actualAverage, 0.01); 

    } 
} 
