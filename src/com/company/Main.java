package com.company;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Library library = new Library(menu);
        library.mainMenu();
    }
}
