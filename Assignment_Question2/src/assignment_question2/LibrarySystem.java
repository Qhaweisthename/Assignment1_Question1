package assignment_question2;

import java.util.Scanner;



public class LibrarySystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            // Display the main menu
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Search for a book");
            System.out.println("3. Remove a book");
            System.out.println("4. View library catalog");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); // Read the user's choice
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Adding a book
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    library.addBook(title, author, year);
                    break;
                case 2:
                    // Searching for a book
                    System.out.print("Enter title to search: ");
                    title = sc.nextLine();
                    library.searchBook(title);
                    break;
                case 3:
                    // Removing a book
                    System.out.print("Enter title to remove: ");
                    title = sc.nextLine();
                    library.removeBook(title);
                    break;
                case 4:
                    // Viewing the library catalog
                    library.printLibrary();
                    break;
                case 5:
                    // Exiting the program
                    System.out.println("Exiting Library Management System. Goodbye!");
                    System.exit(0);
                default:
                    // Handling invalid choices
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}