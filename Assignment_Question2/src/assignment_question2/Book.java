/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_question2;

/**
 *
 * @author user-pc
 */
public class Book extends LibrarySystem {
    private String title;
    private String author;
    private int year;

    // Constructor to initialize a Book object with title, author, and year.
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getter method to retrieve the title of the book.
    public String getTitle() {
        return title;
    }

    // Getter method to retrieve the author of the book.
    public String getAuthor() {
        return author;
    }

    // Getter method to retrieve the publication year of the book.
    public int getYear() {
        return year;
    }

    // Override toString method to provide a formatted string representation of the book.
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }
}

/**
 * Library class represents a collection of books with add, search, remove, and print functionality.
 */
class Library {
    private Book[] books;
    private int bookCount;
    private static final int MAX_BOOKS = 100;

    // Constructor to initialize a Library object with an array of books and book count.
    public Library() {
        books = new Book[MAX_BOOKS];
        bookCount = 0;
    }

    // Method to add a book to the library.
    public void addBook(String title, String author, int year) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount] = new Book(title, author, year);
            bookCount++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("The library is full. Cannot add more books.");
        }
    }

    // Method to search for a book by title.
    public void searchBook(String title) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:\n" + books[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }

    // Method to remove a book by title.
    public void removeBook(String title) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                // Shift books to fill the gap
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                bookCount--;
                System.out.println("Book removed successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }

    // Method to print the library catalog.
    public void printLibrary() {
        System.out.println("\nLibrary Catalog:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("\nBook #" + (i + 1));
            System.out.println(books[i]);
        }
        System.out.println();
    }
}