package kr.ac.kookmin.cs.oop.homework.four;

public class Member {
    String name;
    String id;
    String password;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean login(String id, String password) {
        if (this.id.equals(id) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public void logout() {
        System.out.println("You are logged out");
    }
}
