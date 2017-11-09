package kr.ac.kookmin.cs.oop.homework.four;

public class Library {
    private String name;
    public static String hour = "9 AM to 5 PM";
    private Book[] books;

    public Library() {
        this("defaultName");
    }

    public Library(String name) {
        this.name = name;
        books = new Book[10];
        for (int i = 0; i < books.length; ++i) {
            books[i] = null;
        }
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; ++i) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void printAllBooks() {
        for (int i = 0; i < books.length; ++i) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + " in " + name);
            }
        }
    }

    public void printAllRentedBooks() {
        for (int i = 0; i < books.length; ++i) {
            if (books[i] != null && books[i].isInPlace() == false) {
                System.out.println(books[i].getTitle() + " is rented in " + name);
            }
        }
    }

    public boolean rentBook(String title) {
        for (int i = 0; i < books.length; ++i) {
            if (books[i] != null && books[i].getTitle().equals(title) && books[i].isInPlace() == true) {
                books[i].rent();
                return true;
            }
        }

        return false;
    }

    public boolean handInBook(String title) {
        for (int i = 0; i < books.length; ++i) {
            if (books[i] != null && books[i].getTitle().equals(title) && books[i].isInPlace() == false) {
                books[i].handIn();
                return true;
            }
        }
        return false;
    }
}
