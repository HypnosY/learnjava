package com.leon.demo;

public class TestDemo2 {
    public static void main(String args[]){
        book book1 = new book("Java", 20);
        book book2 = new book("Java", 20);

        if (book1.getTitle().equals(book2.getTitle()) && book1.getPrice()==book2.getPrice()){
            System.out.println("同一个对象");
        }
        else{
            System.out.println("不是同一个对象");
        }
    }
}

class book {
    private String title;
    private double price;

    public book(String title, double price)
    {
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public double getPrice() {
        return price;
    }
}