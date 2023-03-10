package com.amazon.buspassmanagement;

import java.util.Scanner;

import com.amazon.buspassmanagement.controller.AuthenticationService;
import com.amazon.buspassmanagement.controller.BusPassManagement;
import com.amazon.buspassmanagement.controller.FeedbacksManagement;
import com.amazon.buspassmanagement.controller.RoutesManagement;
import com.amazon.buspassmanagement.controller.StopsManagement;
import com.amazon.buspassmanagement.controller.VehiclesManagement;
import com.amazon.buspassmanagement.db.DB;

public class Menu {
	
	AuthenticationService auth = AuthenticationService.getInstance();
	RoutesManagement routes = RoutesManagement.getInstance();
	StopsManagement stops = StopsManagement.getInstance();
	VehiclesManagement vehicles= VehiclesManagement.getInstance();
	BusPassManagement buspass = BusPassManagement.getInstance();
	FeedbacksManagement feedbacks = FeedbacksManagement.getInstance();
	Scanner scanner = new Scanner(System.in);
	
	void showMainMenu() {
		// Initial Menu for the Application
        while(true) {
        	try {
            	System.out.println("1: Admin");
            	System.out.println("2: User");
            	System.out.println("3: Quit");
            	System.out.println("Select an Option");
            	
            	int choice = Integer.parseInt(scanner.nextLine());//scanner.nextInt();
            	
            	if (choice == 3) {
            		scanner.close();
            		DB db = DB.getInstance();
            		db.closeConnection();
            		System.out.println("Thank You For using Bus Pass Management App");
            		break;
            	}
            	
    			try {
    				MenuFactory.getMenu(choice).showMenu();
    			}
    			catch (Exception e) {
    				System.out.println("[main] Error While showing the menu"+e);
    			}
			} catch (Exception e) {
				System.err.println("Invalid Input:" +e);
			}
        }
	}

	public void showMenu() {
		System.out.println("Showing Menu...");
	}
}
