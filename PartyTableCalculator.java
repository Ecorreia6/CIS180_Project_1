import java.util.*;

public class PartyTableCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int partyGuests;
		
		// Scanner gets created
		Scanner keyboardInput = new Scanner (System.in);
		System.out.println("Party Table Calculator");
		System.out.println("Please enter the number of people attending the party:");
		
		// Scanner scans whatever was put in after first line of text
		partyGuests = keyboardInput.nextInt();
		
		//Calculates the number of seats, cost, and leftover seats for Gluteus Cradleus Tables and prints it
		int GCNumber = partyGuests / 5; //No Math.ceil or Math.round
		int plusOne = (partyGuests % 5 + 4) / 5;
		GCNumber +=  plusOne;
		int GCSeats = GCNumber * 5;
		double GCCost = GCSeats / 5 * 15.49;
		int GCLeftover = GCSeats - partyGuests;
		System.out.println("The cost for " + GCNumber + " set(s) of seats with a total of " + GCSeats + " seats is $" + GCCost 
							+ " at Gluteus Cradleus Seats.\n There will be " + GCLeftover + " Extra seats.");
		
		//Calculates the number of tables and cost for Arthur King Tables and prints it
		int AKNumber  = partyGuests / 12; 
		plusOne = (partyGuests % 12 + 11) / 12;
		AKNumber += plusOne;
		int AKTables = AKNumber;
		int AKSpots = AKTables * 12;
		double AKCost = AKTables * 24.99;
		int AKLeftover = AKSpots - partyGuests;
		System.out.println("The cost for " + AKNumber + " table set(s) that can hold " + AKSpots + " seats is $" + AKCost 
							+ " at Arthur King Tables.\n There will be " + AKLeftover + " Extra seat spaces.");
		
		// Getting the sub-total, tax, and total
		double subTotal = GCCost + AKCost;
		double tax = subTotal * .0625;
		double total = subTotal + tax;
		System.out.printf("\nThe sub total is $" + String.format("%.2f",subTotal) + ", with a tax of $" + String.format("%.2f",tax) 
							+ ", and the total is $" + String.format("%.2f",total));
	}
}
