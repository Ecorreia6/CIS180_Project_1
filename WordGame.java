import java.util.*;

public class WordGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Strings of each input
		String userName;
		String userAge;
		String cityName;
		String collegeName;
		String profession;
		String animal;
		String petName;
		
		// Scanner gets created
		Scanner keyboardInput = new Scanner (System.in);
		System.out.println("Please enter the following answers:\n Name:");
		
		// Scanner scans whatever was put in after first line of text
		userName = keyboardInput.nextLine();
		System.out.println("Age:");
		userAge = keyboardInput.nextLine();
		System.out.println("Name of a city:");
		cityName = keyboardInput.nextLine();
		System.out.println("Name of a college:");
		collegeName = keyboardInput.nextLine();
		System.out.println("Name a profession:");
		profession = keyboardInput.nextLine();
		System.out.println("Name of an animal:");
		animal = keyboardInput.nextLine();
		System.out.println("A pet's name:");
		petName = keyboardInput.nextLine();
		
		// Put in the collected values into a pre-made story
		System.out.println("Story 1:\n There once was a person named " + userName + " who lived in " + cityName + ". At the age of " + userAge + ", " + userName + " went to\n"
				+ "college at " + collegeName + ". " + userName + " graduated and went to work as a " + profession + ". Then, " + userName + "\n"
				+ "adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after!");
		// Make your own story
		System.out.println("Story 2:\n Once upon a time, there was a(n) " + animal + " named " + petName + ".\nWhile exploring the " + userAge + " year old " + collegeName + " college in "
				+  cityName + ", " + petName + " found a " + profession + " named " + userName + " who fed " + petName + " delicious food.\n" + petName + " went home happily that night!");

	}

}
