/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fashiontrendapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class FashionTrendApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaration
        int choice;
        ArrayList<FashionItem> myFashionItems = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        // Welcome message
        System.out.println("=== WELCOME TO FASHION TREND TRACKER ===");
        System.out.println("Manage your fashion catalog efficiently!");
        
        while (true) {
            System.out.println("\n**********");
            System.out.println("Choose from the below Menu");
            System.out.println("**********");
            System.out.println("<1> Add Fashion Item");
            System.out.println("<2> Search Fashion Item by Brand");
            System.out.println("<3> Delete Fashion Item");
            System.out.println("<4> View All Fashion Items");
            System.out.println("<5> Exit");
            System.out.print("----> ");
            choice = Integer.parseInt(input.nextLine());
            
            switch (choice) {
                case 1:
                    myFashionItems.add(captureFashionItem(input));
                    System.out.println("Fashion item added successfully!");
                    break;
                case 2:
                    searchByBrand(myFashionItems, input);
                    break;
                case 3:
                    deleteFashionItem(myFashionItems, input);
                    break;
                case 4:
                    showAllItems(myFashionItems);
                    break;
                
                case 5:
                    closeApp();
                    break;
                default:
                    System.out.println(" Invalid input! Please choose 1-7.");
            }
        }
    }
    

    
    public static FashionItem captureFashionItem(Scanner input) {
        int itemID;
        String itemName;
        String brand;
        double price;
        String category;
        int trendScore;
        
        System.out.println("=== ADD FASHION ITEM ===");
        System.out.print("Enter item ID: ");
        itemID = Integer.parseInt(input.nextLine());
        
        System.out.print("Enter item name: ");
        itemName = input.nextLine();
        
        System.out.print("Enter brand: ");
        brand = input.nextLine();
        
        System.out.print("Enter price (R): ");
        price = Double.parseDouble(input.nextLine());
        
        System.out.println("Choose category:");
        System.out.println("1. Clothing  2. Accessories  3. Footwear  4. Jewelry");
        System.out.print("Enter category: ");
        String[] categories = {"Clothing", "Accessories", "Footwear", "Jewelry"};
        int catChoice = Integer.parseInt(input.nextLine()) - 1;
        category = (catChoice >= 0 && catChoice < categories.length) ? categories[catChoice] : "Other";
        
        System.out.print("Enter trend score (1-100): ");
        trendScore = Integer.parseInt(input.nextLine());
        FashionItem item = null;
        
        
        return item;
    }
    
    
    public static void searchByBrand(ArrayList<FashionItem> myFashionItems, Scanner input) {
        String brandToSearch;
        boolean found = false;
        
        System.out.print("\nEnter the brand name to search: ");
        brandToSearch = input.nextLine();
        
        System.out.println("\n=== SEARCH RESULTS ===");
        for (FashionItem item : myFashionItems) {
            if (brandToSearch.equalsIgnoreCase(item.getBrand())) {
              
                found = true;
            }
        }
        
        if (!found) {
            System.out.println(" No items found for brand: " + brandToSearch);
        }
        System.out.println("=== End Search Results ===");
    }
    
    /**
     * Delete a fashion item by ID
     * @param myFashionItems ArrayList of fashion items
     * @param input Scanner object for user input
     */
    public static void deleteFashionItem(ArrayList<FashionItem> myFashionItems, Scanner input) {
        int searchID;
        boolean deleted = false;
        
        System.out.print("\nEnter the item ID to delete: ");
        searchID = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < myFashionItems.size(); i++) {
            if (searchID == myFashionItems.get(i).getItemID()) {
                String deletedItemName = myFashionItems.get(i).getItemName();
                myFashionItems.remove(i);
                System.out.println("✅ Deleted: " + deletedItemName);
                deleted = true;
                break; // Exit loop after deletion
            }
        }
        
        if (!deleted) {
            System.out.println("❌ Item with ID " + searchID + " not found.");
        }
    }
    
     public static void showAllItems(ArrayList<FashionItem> myFashionItems) {
        if (myFashionItems.isEmpty()) {
            System.out.println("\n📭 No fashion items in catalog!");
            return;
        }
        
        System.out.println("\n=== FASHION CATALOG ===");
        System.out.printf("%-5s %-20s %-15s %-10s %-12s %-8s %s%n", 
                         "ID", "Item Name", "Brand", "Price", "Category", "Score", "Status");
        System.out.println("─".repeat(80));
        
        for (FashionItem item : myFashionItems) {
            System.out.printf("%-5d %-20s %-15s $%-9.2f %-12s %-8d %s%n",
                                                        item.getItemID(),
                                                        item.getItemName(),
                                                        item.getBrand(),
                                                        item.getPrice(),
                                                        item.getCategory(),
                                                      item.getTrendScore(),
                                                      item.getTrendScore());
        }
        System.out.println("=== End Catalog ===");
    }
    
 public static void closeApp() {
        System.out.println(" Thank you for using Fashion Trend Tracker!");
        
        System.exit(0);
    }
} 
