package org.example;

import org.example.sweet.Sweet;
import org.example.sweet.candy.Candy;
import org.example.sweet.candy.Jelly;
import org.example.sweet.candy.Praline;
import org.example.sweet.candy.Taffy;
import org.example.sweet.chocolate.Chocolate;
import org.example.sweet.chocolate.DairyMilk;
import org.example.sweet.chocolate.FiveStar;
import org.example.sweet.chocolate.KitKat;

import java.util.Set;
import java.util.TreeSet;

public class Shop {
    private static final Set<Sweet> list = new TreeSet<>((e1, e2) -> e1.getName().compareTo(e2.getName()));

    static void populateItems() {
        list.add(new FiveStar());
        list.add(new DairyMilk());
        list.add(new KitKat());
        list.add(new Praline());
        list.add(new Taffy());
        list.add(new Jelly());
    }

    private void showChocolates() {
        for (Sweet sweet : list) {
            if (sweet instanceof Chocolate) {
                System.out.println(sweet);
            }
        }
    }

    private void showCandies() {
        for (Sweet sweet : list) {
            if (sweet instanceof Candy) {
                System.out.println(sweet);
            }
        }
    }

    public void execute(int choice) {
        switch (choice) {
            case 1:
                showChocolates();
                break;
            case 2:
                showCandies();
                break;
            case 3:
                System.out.println("Exiting Program");
                break;
        }
    }
}
