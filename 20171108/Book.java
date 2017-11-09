package kr.ac.kookmin.cs.oop.homework.four;

public class Book {
    private String title;
    private boolean inPlace;

    public Book(String title) {
        this.title = title;
        this.inPlace = true;
    }

    public boolean isInPlace() {
        return inPlace;
    }

    public String getTitle() {
        return title;
    }

    public void rent() {
        if (inPlace == true) {
            System.out.println("You rented " + title);
            inPlace = false;
        } else {
            System.out.println(title + " is alreay rented");
        }
    }

    public void handIn() {
        if (inPlace == false) {
            System.out.println("Thank you for returning " + title);
            inPlace = true;
        } else {
            System.out.println(title + " is not rented yet (you cannot return it)");
        }
    }

}
