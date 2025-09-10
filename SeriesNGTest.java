/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tv.series;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author lab_services_student
 */
public class SeriesNGTest {
    
    public SeriesNGTest() {
    }

    @Test
    public void testGetSeriesID() {
    }

    @Test
    public void testGetSeriesAge() {
    }

    @Test
    public void testGetSeriesNumberOfEpisodes() {
    }

    @Test
    public void testGetSeriesName() {
    }
    
     
    @Test
    public void testSomeMethod() {
    }
    
    @Test
    public void testFindSeriesByIdFound() {
        // arrange / expected
        ArrayList<Series> mySeries = new ArrayList<>();
        Series expectedSeries = new Series(1, "Breaking Bad", 16, 62);
        mySeries.add(expectedSeries);
        mySeries.add(new Series(2, "Friends", 12, 236));
        Scanner Scanner = null;
        Object actualSeries = null;
        
        
        // assert
        assertEquals(expectedSeries, actualSeries, "Series should be found by ID");
    }
    
    @Test
    public void testFindSeriesByIdNotFound() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        mySeries.add(new Series(1, "Breaking Bad", 16, 62));
        
        // act
        Series actualSeries = TVSeries.searchSeries();
        
        // assert
        assertNull(actualSeries, "Series should not be found for non-existent ID");
    }
    
    @Test
    public void testIsValidAgeRestrictionTrue() {
        // arrange / expected
        int validAge = 15;
        boolean expectedResult = true;
        
        // act / actual
        
        Object actualResult = null;
      
        
        // assert
        assertEquals(expectedResult, actualResult, "Age 15 should be valid");
    }
    
    @Test
    public void testIsValidAgeRestrictionFalse() {
        // arrange / expected
        int invalidAge = 25;
        boolean expectedResult = false;
        Object actualResult = null;

        
        // assert
        assertEquals(expectedResult, actualResult, "Age 25 should be invalid");
    }
    
    @Test
    public void testIsValidAgeRestrictionBoundaryValues() {
        // arrange
        int minValidAge = 2;
        int maxValidAge = 18;
        int belowMin = 1;
        int aboveMax = 19;
        
        
    }
    
    @Test
    public void testCaptureSeriesAddsToList() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        String input = "3\nThe Office\n12\n201\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        int expectedSize = 1;
        
        // Capture output to avoid console spam
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // act
        TVSeries.captureSeries( mySeries, scanner );
        int actualSize = mySeries.size();
        
        // assert
        assertEquals(expectedSize, actualSize, "Series should be added to list");
        
        // Reset System.out
        System.setOut(System.out);
    }
    
    @Test
    public void testCaptureSeriesCorrectData() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        String input = "5\nStranger Things\n14\n42\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // act
        TVSeries.captureSeries( mySeries, scanner );
        Series actualSeries = mySeries.get(0);
        
        // assert
        assertEquals(5, actualSeries.getSeriesID(), "Series ID should match input");
        assertEquals("Stranger Things", actualSeries.getSeriesName(), "Series name should match input");
        assertEquals(14, actualSeries.getSeriesAge(), "Series age should match input");
        assertEquals(42, actualSeries.getSeriesNumberOfEpisodes(), "Number of episodes should match input");
        
        // Reset System.out
        System.setOut(System.out);
    }
    
    @Test
    public void testDeleteSeriesSuccess() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        mySeries.add(new Series(1, "Breaking Bad", 16, 62));
        mySeries.add(new Series(2, "Friends", 12, 236));
        String input = "1\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        boolean expectedResult = true;
        int expectedSize = 1;
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // act
        
        int actualSize = mySeries.size();
        Object actualResult = null;
        
        // assert
        assertEquals(expectedResult, actualResult, "Delete should return true for existing series");
        assertEquals(expectedSize, actualSize, "List size should decrease by 1");
        
        // Reset System.out
        System.setOut(System.out);
    }
    
    @Test
    public void testDeleteSeriesNotFound() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        mySeries.add(new Series(1, "Breaking Bad", 16, 62));
        String input = "999\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        boolean expectedResult = false;
        int expectedSize = 1;
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // act
        
        int actualSize = mySeries.size();
        Object actualResult = null;
        
        // assert
        assertEquals(expectedResult, actualResult, "Delete should return false for non-existent series");
        assertEquals(expectedSize, actualSize, "List size should remain unchanged");
        
        // Reset System.out
        System.setOut(System.out);
    }
    
    @Test
    public void testSearchSeriesFound() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        Series expectedSeries = new Series(2, "Friends", 12, 236);
        mySeries.add(new Series(1, "Breaking Bad", 16, 62));
        mySeries.add(expectedSeries);
        String input = "2\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        Series actualSeries = method(mySeries, scanner);
        
        // assert
        assertEquals(expectedSeries, actualSeries, "Search should return the correct series");
        assertNotNull(actualSeries, "Found series should not be null");
        
        // Reset System.out
        System.setOut(System.out);
    }

        private Series method(ArrayList<Series> mySeries, Scanner input) {
            // act
        return null;
            // act
          
        }
    
    @Test
    public void testSearchSeriesNotFound() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        mySeries.add(new Series(1, "Breaking Bad", 16, 62));
        String input = "999\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // act
        Object actualSeries;
        Object Series = null;
       
        
        // assert
        assertNull(Series, "Search should return null for non-existent series");
        
        // Reset System.out
        System.setOut(System.out);
    }
    
    @Test
    public void testUpdateAgeRestrictionSuccess() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        Series testSeries = new Series(1, "Breaking Bad", 16, 62);
        mySeries.add(testSeries);
        String input = "1\n14\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        boolean expectedResult = true;
        int expectedNewAge = 14;
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        
        // Reset System.out
        System.setOut(System.out);
    }
    
    @Test
    public void testUpdateAgeRestrictionInvalidAge() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
         
        Series testSeries = new Series(1, "Breaking Bad", 16, 62);
        mySeries.add(testSeries);
        String input = "1\n25\n"; 
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        boolean expectedResult = false;
        int expectedAge = 16; 
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // act
       
        int actualAge = testSeries.getSeriesAge();
        Object actualResult = null;
        
        // assert
        assertEquals(expectedResult, actualResult, "Update should return false for invalid age");
        assertEquals(expectedAge, actualAge, "Age should remain unchanged for invalid input");
        
        // Reset System.out
        System.setOut(System.out);
    }
    
    @Test
    public void testUpdateAgeRestrictionSeriesNotFound() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        
        mySeries.add(new Series(1, "Breaking Bad", 16, 62));
        String input = "999\n"; // Non-existent ID
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        boolean expectedResult = false;
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Object actualResult = null;
        
       
        
        // assert
        assertEquals(expectedResult, actualResult, "Update should return false when series not found");
        
        // Reset System.out
        System.setOut(System.out);
    }
    
    @Test
    public void testPrintSeriesReportEmptyList() {
        // arrange
        ArrayList<Series> emptyList = new ArrayList<>();
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // act
        TVSeries.SeriesReport(emptyList);
        String actualOutput = outputStream.toString();
        
        // assert
        assertTrue(actualOutput.contains("No series captured yet"), "Should display empty list message");
        
        // Reset System.out
        System.setOut(System.out);
    }
    
    @Test
    public void testPrintSeriesReportWithData() {
        // arrange
        ArrayList<Series> mySeries = new ArrayList<>();
        mySeries.add(new Series(1, "Breaking Bad", 16, 62));
        mySeries.add(new Series(2, "Friends", 12, 236));
        
        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // act
        TVSeries.SeriesReport(mySeries);
        String actualOutput = outputStream.toString();
        
        // assert
        assertTrue(actualOutput.contains("Series Report 2025"), "Should contain report header");
        assertTrue(actualOutput.contains("Breaking Bad"), "Should contain first series name");
        assertTrue(actualOutput.contains("Friends"), "Should contain second series name");
        
        // Reset System.out
        System.setOut(System.out);
    }
    }
    


    

