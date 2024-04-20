package net.basepatterns.creational.abstract_factory.banking;

import net.basepatterns.creational.abstract_factory.Developer;
import net.basepatterns.creational.abstract_factory.ProjectTeamFactory;
import net.basepatterns.creational.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }
}
