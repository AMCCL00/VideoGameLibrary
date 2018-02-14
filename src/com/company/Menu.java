package com.company;

import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private Library library = new Library(this);

    /**Just nit-picking, I'd start the app in the Library instead of the menu, given the app is a library. And I'd have the library instantiate the menu
     * and use it; just like in real life, a library would present the menu and use your response to determine what it would do with your games. */

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
                    input.nextLine();
                    System.out.println("You have chosen to add a game.\n" +
                            "What is the title of this game?");
                    Game game = new Game(input.nextLine());
                    System.out.println("You have added " + game.getTitle() + " to your library, this game can now be checked out.\n");
                    library.addGame(game);
                    break;
                case 2:
                    //remove
                    System.out.println("You have chosen to remove a game from your library. \n" +
                            "Here are a list of games, type the one you would like to remove.");
                    library.libraryList();
                    //create method to list all games that can be removed
                    library.removeGame(input.nextInt());
                    break;
                case 3:
                    //View Library
                    library.libraryList();
                    System.out.println(" ");
                    startMenu();
                    break;
                case 4:
                    //Check out Game
                    System.out.println("You have chosen to check out a game. \n" +
                            "Here are a list of your games, which would you like to check out?");
                    library.libraryList();
                    //use the method from the removed games list for this list
                    library.checkoutGame(input.nextInt());
                    System.out.println(" ");
                    break;
                case 5:
                    //Check in Game
                    System.out.println("You have selected to check a game in \n" +
                            "Here is a list of your checked out games, which would you like to check in?");
                    library.checkedOutGameList();
                    //use the list from checked out games
                    library.checkInGame(input.nextInt());
                    System.out.println(" ");
                    break;
                case 6:
                    //View checked out game
                    library.checkedOutGameList();
                    System.out.println(" ");
                    startMenu();
                    break;
                case 7:
                    //Exit
                    System.exit(12321);
                    break;
                default:
                    input.nextLine();
                    System.out.println("Please pick a number between 1 and 7.\n");
                    startMenu();
            }
        }catch (Exception e){
            input.nextLine();
            System.out.println("Please pick a number between 1 and 7.\n");
            startMenu();
        }
    }
}