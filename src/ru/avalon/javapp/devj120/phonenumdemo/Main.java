package ru.avalon.javapp.devj120.phonenumdemo;

public class Main {
    public static void main(String[] args) {
        PhoneNumber pn1 = new PhoneNumber("981", "1234567"),
                    pn2 = new PhoneNumber("7890", "654321");
        System.out.println(pn1);
        System.out.println(pn2);
    }
}
