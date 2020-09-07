/*
Program name: Program #2: Initials
Description: automatically display a users initials when supplied with first. middle and last name.
Author: Christian Mudd
Date: 07/09/2020
Version: 1.0
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // promp user
    System.out.println("Enter first name: ");
    String fName = scan.nextLine();
    System.out.println("Enter middle name: ");
    String mName = scan.nextLine();
    System.out.println("Enter last name");
    String lName = scan.nextLine();

    //parse first letter from each name
    char fInitial = fName.charAt(0);
    char mInitial = mName.charAt(0);
    char lInitial = lName.charAt(0);


    // display users inputs and calculate output
    System.out.println("Your name is: " + fName + " " + mName + " " + lName + ".");
    System.out.println("Your initials are: " + fInitial + ". " + mInitial + ". " + lInitial + ".");

    scan.close();
  }
}