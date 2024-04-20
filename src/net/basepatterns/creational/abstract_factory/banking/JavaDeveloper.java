package net.basepatterns.creational.abstract_factory.banking;

import net.basepatterns.creational.abstract_factory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer write code for banking");
    }
}
