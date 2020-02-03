package org.example.sweet;

import java.util.List;

public abstract class Sweet implements Processing {
    private double price;
    private String name;
    private double weight;

    public Sweet(double price, String name, double weight) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void sort(List<Sweet> list, String parameter) {
        switch (parameter) {
            case "name":
                list.sort((e1, e2) -> {
                    return e1.name.compareTo(e2.name);
                });
                break;
            case "price":
                list.sort((e1, e2) -> {
                    if (e1.price == e2.price) {
                        return e1.name.compareTo(e2.name);
                    } else {
                        return e1.price > e2.price ? 1 : -1;
                    }
                });
                break;
            case "weight":
                list.sort((e1, e2) -> {
                    if (e1.weight == e2.weight) {
                        return e1.name.compareTo(e2.name);
                    } else {
                        return e1.weight > e2.weight ? 1 : -1;
                    }
                });
                break;
        }
    }

    @Override
    public String toString() {
        return name + "\tPrice: " + price + "\tWeight: " + weight;
    }

    @Override
    public void pack() {
        System.out.println("Packing the sweet");
    }

    @Override
    public void print(List<Sweet> list) {
        for (Sweet sweet : list) {
            System.out.println(sweet);
        }
    }
}
