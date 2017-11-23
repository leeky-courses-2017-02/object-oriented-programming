package kr.ac.kookmin.cs.oop.inheritance.abstractclass;

public abstract class Mammal extends Animal {

    @Override
    protected String breathe() {
        return "breathe using lung";
    }
}
