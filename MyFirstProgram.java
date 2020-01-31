/*
Anthony Garrard
Chapter 2 Lesson 2 example
My first program
1/20
*/

// This is our class declaration

public class MyFirstProgram{
	//this is a block of code, this block will contain all items for the class
	//this is a variable it stores data
	int x = 5;
	String y = "the";
	
	//this is my constructor method
	public MyFirstProgram(){
		//this block is for my constructor
		
		//this line prints to the console
		System.out.println("Anthony");
		System.out.println("'Success consists of going from failure to failure without loss of enthusiasm' - Winston Churchill");		
	}
	
	//entry point
	public static void main(String[] args) {
		//creates a new object of the class MyFirstProgram
		new MyFirstProgram();
	}
}