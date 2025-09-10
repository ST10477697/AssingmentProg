/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tv.series;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lab_services_studenta
 */
public class TVSeries {

    public static void main(String[] args) {
        // Declaration
        Scanner input = new Scanner(System.in);
        ArrayList<Series> mySeries = new ArrayList<>();

        int choice;

        System.out.println("LATEST SERIES - 2025");
        System.out.println("******************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");

        if (input.equals("1")) {
            System.out.println("Goodbye!");
            return;
        }

        boolean running = true;

        while (running) {
            System.out.println("Please select one of the following menu items1");
            System.out.println("(1) Capture a new series");
            System.out.println("(2) Search for a series");
            System.out.println("(3) Update series age restriction");
            System.out.println("(4) Delete a series");
            System.out.println("(5) Print series report - 2025");
            System.out.println("(6) Exit Application ");

            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    captureSeries(mySeries, input);
                    break;
                case 2:
                    searchSeries(mySeries, input);
                    break;
                case 3:
                    AgeRestriction(mySeries,input);
                    break;
                case 4:
                    deleteSeries(mySeries, input);
                    break;
                case 5:
                    SeriesReport(mySeries);
                    break;
                case 6:
                    ExitSeriesApplication();
                default:
                    System.out.println("Invalid option!! Try again");
            }
        }
    }

    //Capturing Series information(Java Programming,j.Farrell)
    public static void captureSeries(ArrayList<Series> mySeries, Scanner input) {
        int SeriesID, SeriesAge, SeriesNumberOfEpisodes;
        String SeriesName;

        System.out.println("Enter SeriesID:");
        SeriesID = Integer.parseInt(input.nextLine());
        System.out.println("Enter SeriesName:");
        SeriesName = input.nextLine();
        System.out.println("Enter SeriesAge:");
        SeriesAge = Integer.parseInt(input.nextLine());
        System.out.println("Enter SeriesNumberOfEpisodes:");
        SeriesNumberOfEpisodes = Integer.parseInt(input.nextLine());

        System.out.println("You have successfully captured the information");
        System.out.println("===============");

    }

    //Updating Series age restriction
    public static void AgeRestriction(ArrayList<Series> input, Scanner scanner) {

        int AgeRestriction = 0;
        System.out.println("Enter Series age");

        if (AgeRestriction >= 2 && AgeRestriction <= 18) {

        } else {

            System.out.println("You have entered an incorect series age!!");
            System.out.println("Please re-enter the series age");
        }

    }
    //Search Series
    public static void searchSeries(ArrayList<Series> mySeries, Scanner input) {

        System.out.println("Enter Series ID");
        int searchID = Integer.parseInt(input.nextLine());

        System.out.println("===TVSeries===");
        for (Series series : mySeries) {

        }
    }

    // Delete functionality((Java Programming,j.Farrell)
    public static void deleteSeries(ArrayList<Series> mySeries, Scanner input) {
        System.out.print("Enter the series id to delete: ");
        int id = Integer.parseInt(input.nextLine());
        int searchID = Integer.parseInt(input.nextLine()); 

        for (int i = 0; i < mySeries.size(); i++) {
            if (searchID == mySeries.get(i).getSeriesID()) {
                mySeries.remove(i);
            }
        }
    }
    //Series Report Print
    public static void SeriesReport(ArrayList<Series> mySeries) {
        if (mySeries.isEmpty()) {
            System.out.println("No series captured yet");
        } else {
            System.out.println("--Series report---");
            for (Series series : mySeries) {
                System.out.println("----------");

            }
        }

    }
    //Exiting Application5
    public static void ExitSeriesApplication() {
        System.out.println("Exiting application....goodbye!!");
        System.exit(0);
    }

    static Series searchSeries() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
