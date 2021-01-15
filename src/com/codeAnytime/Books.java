package com.codeAnytime;

public class Books {
    private int isbn;
    private String name;
    private int pages;

    public int getIsbn() {
        System.out.println("ISBN is " + isbn );
        return isbn;
    }

    public String getName() {
        System.out.println("The name of the book is " + name);
        return name;
    }

    public int getPages() {
        System.out.println("The book has " + pages + " pages");
        return pages;
    }

    public double getWeight() {
        System.out.println("The weight is " + weight + " kg");
        return weight;
    }

    public Books(int isbn, String name, int pages, double weight) {
        this.isbn = isbn;
        this.name = name;
        this.pages = pages;
        this.weight = weight;
    }

    private double weight;
}

