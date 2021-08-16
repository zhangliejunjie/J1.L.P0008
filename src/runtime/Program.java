package runtime;

import data.Menu;

public class Program {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("");
        mainMenu.addNewOption("0. Build your data structure");
        mainMenu.addNewOption("1. Show the book list");
        mainMenu.addNewOption("2. Add new book");
        mainMenu.addNewOption("3. Update book");
        mainMenu.addNewOption("4. Delete book");
        mainMenu.addNewOption("5. Search book");
        mainMenu.addNewOption("6. Store data to file");
        mainMenu.addNewOption("7. Quit");
    }
}
