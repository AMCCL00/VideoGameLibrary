package com.company;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    public void startMenu() {
        System.out.println("Welcome to the  Video Game library, what would you like to do?");
        System.out.println("" +
                "1. Add a game to the library \n" +
                "2. Remove a game from the library \n" +
                "3. View your current library \n" +
                "4. Check out a Game \n" +
                "5. Check in a game \n" +
                "6. View Checked out Games \n" +
                "7. Exit the program");

        try {
            switch (input.nextInt()) {
                case 1:
                    //Add
                    break;
                case 2:
                    //remove
                    break;
                case 3:
                    //View Library
                    break;
                case 4:
                    //Check out Game
                    break;
                case 5:
                    //Check in Game
                    break;
                case 6:
                    //View checked out game
                    break;
                case 7:
                    //Exit
                    System.exit(12321);
                    break;
                default:
                    input.nextLine();
                    System.out.println("Please pick a number between 1 and 7.");
                    startMenu();
            }
        }catch (Exception e){
            input.nextLine();
            System.out.println("Please pick a number between 1 and 7.");
            startMenu();
        }
    }
}