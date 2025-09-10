/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package fashiontrendapp;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class FashionItemNGTest {
    
    public FashionItemNGTest() {
    }

    /**
     *
     */
    @Test
    public void testGetItemID() {
    }

    @Test
    public void testGetItemName() {
    }

    @Test
    public void testGetBrand() {
    }

    @Test
    public void testGetPrice() {
    }

    @Test
    public void testGetCategory() {
    }

    @Test
    public void testGetTrendScore() {
    }
    
     @Test
    public void testGetItemID(Scanner input){
        // arrange / expected
        int expectedItemID = 101;
       
        // act/ actual
        FashionItem myFashionItem = new FashionItem();
        myFashionItem.itemID = expectedItemID;
        int actualItemID = myFashionItem.getItemID();
        
        // assert
        assertEquals(expectedItemID, actualItemID, "item ID should match");
    }

    @Test
    public void testGetItemName(ArrayList<FashionItem> myFashionItems,Scanner input){
        // arrange / expected
        String expectedItemName = "Designer Jeans";
       
        // act/ actual
        FashionItem myFashionItem = new FashionItem();
        myFashionItem.itemName = expectedItemName;
        String actualItemName = myFashionItem.getItemName();
        
        // assert
        assertEquals(expectedItemName, actualItemName, "item name should match");
    }

    @Test
    public void testGetBrand(Scanner input){
        // arrange / expected
        String expectedBrand = "Calvin Klein";
       
        // act/ actual
        FashionItem myFashionItem = new FashionItem();
        myFashionItem.brand = expectedBrand;
        String actualBrand = myFashionItem.getBrand();
        
        // assert
        assertEquals(expectedBrand, actualBrand, "brand should match");
    }

    @Test
    public void testGetPrice(Scanner input){
        // arrange / expected
        double expectedPrice = 129.99;
       
        // act/ actual
        FashionItem myFashionItem = new FashionItem();
        myFashionItem.price = expectedPrice;
        double actualPrice = myFashionItem.getPrice();
        
        // assert
        assertEquals(expectedPrice, actualPrice, "price should match");
    }

    @Test
    public void testGetCategory(Scanner input){
        // arrange / expected
        String expectedCategory = "Bottoms";
       
        // act/ actual
        FashionItem myFashionItem = new FashionItem();
        myFashionItem.category = expectedCategory;
        String actualCategory = myFashionItem.getCategory();
        
        // assert
        assertEquals(expectedCategory, actualCategory, "category should match");
    }

    @Test
    public void testGetTrendScore(Scanner input){
        // arrange / expected
        int expectedTrendScore = 85;
       
        // act/ actual
        FashionItem myFashionItem = new FashionItem();
        myFashionItem.trendScore = expectedTrendScore;
        int actualTrendScore = myFashionItem.getTrendScore();
        
        // assert
        assertEquals(expectedTrendScore, actualTrendScore, "trend score should match");
    }

    @Test
    public void testPriceIsZeroOrMore(){
        // arrange
        double testPrice = 59.99;

        // Act
        FashionItem myFashionItem = new FashionItem();
        myFashionItem.price = testPrice;
        double actualPrice = myFashionItem.getPrice();
       
        // Assert
        assertTrue(actualPrice >= 0, "The price must be positive or zero");
    }

    @Test
    public void testTrendScoreInValidRange(){
        // arrange
        int testTrendScore = 75;

        // Act
        FashionItem myFashionItem = new FashionItem();
        myFashionItem.trendScore = testTrendScore;
        int actualTrendScore = myFashionItem.getTrendScore();
       
        // Assert
        assertTrue(actualTrendScore >= 0 && actualTrendScore <= 100, "The trend score must be between 0 and 100");
    }

    @Test
    public void testItemIDIsPositive(){
        // arrange
        int testItemID = 25;

        // Act
        FashionItem myFashionItem = new FashionItem();
        myFashionItem.itemID = testItemID;
        int actualItemID = myFashionItem.getItemID();
       
        // Assert
        assertTrue(actualItemID > 0, "The item ID must be positive");
    }
}

