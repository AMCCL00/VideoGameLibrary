package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

public class Library {

    private final Menu menu;
    private List<Game> gameLibrary = new ArrayList<Game>();
    private List<Game> checkedOutGames = new ArrayList<Game>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    Scanner input = new Scanner(System.in);

    public Library(Menu menu) {
        this.menu = menu;
    }

    protected void addGame(Game game) {
        //Code foes here to add game to Library List
        gameLibrary.add(game);
        menu.startMenu();
    }

    protected void removeGame(int gameIndex) {
        gameIndex -- ;
        gameLibrary.remove(gameIndex);
        System.out.println("The selected game has been removed from your library.\n");
        menu.startMenu();

    }

    protected void checkoutGame(int gameIndex) {
        gameIndex --;
        Game game = gameLibrary.get(gameIndex);

        checkedOutGames.add(game);

        Calendar calendar = Calendar.getInstance();
        System.out.println("You Checked out this game on: " + dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println("The due date of the game is " + dateFormat.format(calendar.getTime()) + "\n");
        game.setDueDate(dateFormat.format(calendar.getTime()));

        gameLibrary.remove(gameIndex);
        menu.startMenu();
    }

    protected void checkInGame(int gameIndex) {
         gameIndex --;
        Game game = checkedOutGames.get(gameIndex);

        System.out.println("Your game has been checked back in.\n");
        checkedOutGames.remove(game);

        menu.startMenu();
    }

    protected void checkedOutGameList() {
        System.out.println("Your currently checked out games are: ");
        for (int i = 0; i < checkedOutGames.size(); i++){
            Game game = checkedOutGames.get(i);
            System.out.println((i + 1) + ". " + game.getTitle());
        }
    }

    protected void libraryList() {
        System.out.println("The games currently in your library are: ");
        for (int i = 0; i < gameLibrary.size(); i++) {
            Game game = gameLibrary.get(i);
            System.out.println((i + 1) + ". " + game.getTitle());
        }
    }
}