import java.util.Scanner;
import java.text.*;
import java.util.*;

public class DOS {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to MS DOS - 0.0.40");
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println("                                                                                                                     |Date: " + (formatDate.format(date)) + "|");
		
		System.out.println("----APPLICATIONS----");
		System.out.println("[1] - CALCULATOR");
		System.out.println("[2] - ABOUT(WINVER)");
		System.out.println("[3] - SETTINGS");
		System.out.println("[4] - POWER MODES");
		
		System.out.println("Enter selection: ");

		
		int selection0 = scanner.nextInt();
		
		if (selection0 == 1) {
			
			SimpleDateFormat formatDate1 = new SimpleDateFormat("dd/MM/yyyy");
			Date date1 = new Date();
			formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
			System.out.println("                                                                                                                     |Date: " + (formatDate1.format(date1)) + "|");
			
			
			System.out.println("Welcome to calculator - beta_0.0.1");
			System.out.println("Which opertion do you want to do? ");
			System.out.println("[1] - Addition ");
			System.out.println("[2] - Subtraction ");
			System.out.println("[3] - Multiplication ");
			System.out.println("[4] - Division (for finding remainder)");
			System.out.println("[0] - CANCEL");
			
			System.out.println("Enter selection: ");
			
			int selection = scanner.nextInt();
			
			if (selection == 1) {
				System.out.println("Enter first number: ");
				int selection2 = scanner.nextInt();
				
				System.out.println("Enter second number: ");
				int selection3 = scanner.nextInt();
				
				System.out.println("The sum is: " + (selection2 + selection3));
				
			}else if (selection == 2){
				System.out.println("Enter the first number: ");
				int selection4 = scanner.nextInt();
				
				System.out.println("Enter the second number: ");
				int selection5 = scanner.nextInt();
				
				System.out.println("The remainder is: " + (selection4 - selection5));
			}else if (selection == 3) {
				System.out.println("Enter the first number: ");
				int selection6 = scanner.nextInt();
				
				System.out.println("Enter the second number: ");
				int selection7 = scanner.nextInt();
				
				System.out.println("The product is: " + (selection6 * selection7));
			}else if (selection == 4) {
				System.out.println("Enter the first number: ");
				int selection8 = scanner.nextInt();
				
				System.out.println("Enter the second number: ");
				int selection9 = scanner.nextInt();
				
				System.out.println("The remainder is: " + (selection9 / selection8));
			}else if (selection == 0) {
				System.out.println("Closed");
				System.out.println("Uptime exceeded --> shutdown code --> 0");
			}
			
			
			else {
				System.out.println("Enter a valid number from the selection!!");
			}
			
			
		}else if (selection0 == 2) {
			System.out.println("MS DOS version - 0.0.40");
		}else if (selection0 == 3) {
			System.out.println("--------------------------------------------------------CONTROL PANEL--------------------------------------------------------");
			
			
			SimpleDateFormat formatDate2 = new SimpleDateFormat("dd/MM/yyyy");
			Date date2 = new Date();
			formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
			System.out.println("                                                                                                                     |Date: " + (formatDate2.format(date2)) + "|");
			
			
			System.out.println("[1]Sound settings" + " | " + "[2]Programs" + " | " + "[3]Help");
			System.out.println("To use another setting, turn off system and run it again :(");

			int control_panel = scanner.nextInt();
			
			if (control_panel == 1) {
				System.out.println("NULL");
				
			}else if (control_panel == 2) {
				System.out.println("Null2");
			}else if (control_panel == 3) {
				System.out.println("Navigation: Navigate using numbers just like how you came here");
				System.out.println("About system: Very basic MS DOS type in terminal (don't expect much)");
				System.out.println("----------------------------UNDER CONSTRUCTION----------------------------");
			}
			
			
		}else if (selection0 == 4) {

			System.out.println("[0] - Shutdown");
			int selection10 = scanner.nextInt();
			System.out.println(selection10 + " - " + "Shut down successful");
															
			
		}
	}
}
