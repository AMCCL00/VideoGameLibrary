package com.company;

import java.util.Scanner;

public class Library {
    Scanner input = new Scanner(System.in);

    protected void addGame(){
        //Code foes here to add game to Library List
        System.out.println("What is the title of the game you would like to add?");
        String title = input.nextLine();

        System.out.println(title + " has been added to the Game Library");

    }
}
