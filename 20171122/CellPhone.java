package kr.ac.kookmin.cs.oop.inheritance.interfaceclass.impl;

import kr.ac.kookmin.cs.oop.inheritance.interfaceclass.PhoneCallable;

public class CellPhone implements PhoneCallable {
    @Override
    public void call(int number) {
        System.out.println(number + ": Call wireless");
    }
    @Override
    public void hangup() {
        System.out.println("hangup wireless");
    }
}
