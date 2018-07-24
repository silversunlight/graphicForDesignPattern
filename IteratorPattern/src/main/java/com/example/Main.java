package com.example;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("1"));
        bookShelf.appendBook(new Book("2"));
        bookShelf.appendBook(new Book("3"));
        bookShelf.appendBook(new Book("4"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book= (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
