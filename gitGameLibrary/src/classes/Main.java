/*
 * GameLibrary - Java Program by Tyler Strohl.
 * https://github.com/TylerWStrohl64/GameLibrary
 * 
 * This is a Text-Based program to search through & manage a digital Video Game Library.
 * A GUI-Based adaption (using Abstract Window Toolkit [AWT] & Swing) will follow.
 */

package classes;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	//Global Variables:
	//*****************
	
	public static boolean isQuit = false;
	
	//********************************************************************
	//
	public static void showMenuOptions(Scanner sc) {
		
		System.out.println("Choose a Menu Option:");
		
		System.out.println("\t" + "Q: Quit.");
		//re-direct to sub-method
		System.out.println("\t" + "S: Search.");
		
		String menOp = sc.next();
		menOp = menOp.toUpperCase();
		
		//*************************************************************************************************************************
		//Q: Quit.
		if (menOp.equals("Q")) {
			
			isQuit = true;
		}
		//*************************************************************************************************************************
		//S: Quit.
		if (menOp.equals("S")) {
			
			System.out.println("I have not been implemented yet.");
		}
		//*************************************************************************************************************************
	}
	
	//
	
	
//********************************************************************
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("This is the Text-Based version of the GameLibrary program. Welcome!" + "\n");
		
		while (isQuit == false) {
			
			showMenuOptions(sc);
		}
		
		sc.close();
	}
}