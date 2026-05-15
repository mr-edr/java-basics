import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;


    Book(int bookId, String title, String author) {
        this.bookId    = bookId;
        this.title     = title;
        this.author    = author;
        this.isAvailable = true;
    }


    void display() {
        String status = isAvailable ? "Available" : "Borrowed";
        System.out.printf("ID: %d | Title: %-30s | Author: %-20s | Status: %s%n",
                bookId, title, author, status);
    }
}


public class LibraryManagement {


    static ArrayList<Book> books = new ArrayList<>();

    static void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
        System.out.println("Book added successfully: " + title);
    }

    static void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n Library Book List");
        for (Book b : books) {
            b.display();
        }
        System.out.println("=======================================\n");
    }

    static void borrowBook(int id) {
        for (Book b : books) {
            if (b.bookId == id) {
                if (b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("You have borrowed: " + b.title);
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    static void returnBook(int id) {
        for (Book b : books) {
            if (b.bookId == id) {
                if (!b.isAvailable) {
                    b.isAvailable = true;
                    System.out.println("Book returned successfully: " + b.title);
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    static void searchBook(String keyword) {
        System.out.println("\n--- Search Results for: " + keyword + " ---");
        boolean found = false;
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                b.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching: " + keyword);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        addBook(1, "The Alchemist",               "Paulo Coelho");
        addBook(2, "Clean Code",                   "Robert C. Martin");
        addBook(3, "Atomic Habits",                "James Clear");
        addBook(4, "To Kill a Mockingbird",        "Harper Lee");
        addBook(5, "Introduction to Algorithms",   "Thomas H. Cormen");

        int choice;

        do {

            System.out.println("===== Library Management System =====");
            System.out.println("1. View All Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Search a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    borrowBook(borrowId);
                    break;

                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    returnBook(returnId);
                    break;

                case 4:
                    System.out.print("Enter book title to search: ");
                    String keyword = sc.nextLine();
                    searchBook(keyword);
                    break;

                case 5:
                    System.out.println("Thank you for using the Library System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
