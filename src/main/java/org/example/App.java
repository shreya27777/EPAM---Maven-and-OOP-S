package org.example;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Shop shop = new Shop();
        Shop.populateItems();
        printInstructions();
        int choice = scanner.nextInt();
        shop.execute(choice);
    }


    private static void printInstructions() {
        System.out.println("Welcome to Online Gift Shop\n" +
                "Press 1 to see list of chocolates\n" +
                "Press 2 to see list of candies\n" +
                "Press 3 to quit");
    }
}
