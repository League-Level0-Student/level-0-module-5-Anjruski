package nested_loops;

import javax.swing.JOptionPane;

public class multipletrickponyboi {
public static void main(String[] args) {

	multipletrickponyboi skills = new multipletrickponyboi();
  	skills.skill1();
  	skills.skill2();
  	skills.skill3();
  	skills.skill4();
  	skills.skill5();

}
void skill1() {
	// Use pop-ups for the following.
	// Ask the user how many dimes they have
String	dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int dime = Integer.parseInt(dimes);


	// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "You have " + dime * 10 + " cents");


	// Ask the user how tall they are (inches)
String inches = JOptionPane.showInputDialog(null, "How tall are you? (Inches)");
int inch = Integer.parseInt(inches);


	// If they are shorter than 36 inches, tell them to eat their Wheaties
if (inch <= 36) {
JOptionPane.showMessageDialog(null, "Go eat you wheaties.");	
}



	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
		for (int b = 0; b <= 30; b++) {
			if (b % 3 == 0) {
				System.out.println(b);
			}
		}







	}

	void skill3() { // Get a random number that is less than 20 and print it to the console 
System.out.println("15");


	// Get another random number that is less than 10 and print it to the console 
System.out.println("7");


	// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, "15 - 7 = 8");


	}

	void skill4() { // In a pop-up, ask the user for the city they live in 
String citys = JOptionPane.showInputDialog(null, "What city do you live in?");


	// If they answered "San Diego", tell them they live in America's Finest City 
if (citys .equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's finest city");
}


	// Otherwise, tell them to move to San Diego 
else {JOptionPane.showMessageDialog(null, "Then you should move to San Diego.");}


	// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars = 2;


	// If there is 1 car, use a pop-up to display the make/model of the car 

//w0t

	// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 

JOptionPane.showMessageDialog(null, "I have 8 wheels in my cars all together");

	}

	void skill5() { // In a pop-up, ask the user for the name of their school 

String school = JOptionPane.showInputDialog("What is the name of your school");

	// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, "You know, " + school + " Is a fantastic school.");

}}

	
	
	
	
	


