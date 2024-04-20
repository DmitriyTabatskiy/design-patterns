package net.basepatterns.creational.abstract_factory;

import net.basepatterns.creational.abstract_factory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.createDeveloper();
        Tester tester = teamFactory.createTester();

        System.out.println("Creating Super Bank System ...");
        developer.writeCode();
        developer.writeCode();
        tester.testCode();
    }
}
