/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: This class tests the Movie class to ensure correct output based on input
 * Due: 02/20/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Hamza Shah
*/

import java.util.Scanner;

public class MovieDriver_Task1 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Movie userMovie = new Movie();
		
		System.out.println("Enter the name of a movie");
		String userTitle = keyboard.nextLine();
		userMovie.setTitle(userTitle);
		
		System.out.println("Enter the rating of the movie");
		String userRating= keyboard.nextLine();
		userMovie.setRating(userRating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int userSoldTickets = keyboard.nextInt();
		userMovie.setSoldTickets(userSoldTickets);
		
		System.out.println(userMovie.toString());	
		System.out.print("Goodbye");
	
		keyboard.close();

	}

}

