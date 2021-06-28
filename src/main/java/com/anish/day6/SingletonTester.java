package com.anish.day6;
import com.anish.day6.Person;

public class SingletonTester {
    public static void main(String[] args) {
       Person person = Person.getInstance();
       person.setContactNo("95964121220");
        System.out.println(person);

        Person person2 = Person.getInstance();
        person2.setContactNo("56565646464");
        System.out.println(person2);
    }
}
