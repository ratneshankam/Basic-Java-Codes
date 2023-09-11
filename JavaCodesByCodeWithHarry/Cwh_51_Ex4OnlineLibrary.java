package com.company;

import java.util.Scanner;

class library{
    String [] books;
    int no_of_books;
    public library() {
        this.books = new String[100];
        no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book: this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
            for (int i = 0; i<this.books.length; i++) {
                if (this.books[i].equals(book)) {
                    System.out.println("The book has been issued!");
                    this.books[i] = null;
                    return;
                }
            }
            System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class Cwh_51_Ex4OnlineLibrary {
    public static void main(String[] args) {
//        You have to implement a library using java class library
//        Methods: addBook, issueBook, returnBook, showAvailableBooks
//        Properties: Array to store the available books,
//        Array to store the issued books
        library l = new library();
        l.addBook("Think and grow rich");
        l.addBook("Algorithms");
        l.addBook("C++");
        l.showAvailableBooks();
        l.issueBook("C+");
        l.showAvailableBooks();
        l.returnBook("C++");
        l.showAvailableBooks();
    }
}
