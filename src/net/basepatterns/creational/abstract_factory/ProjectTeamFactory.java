package net.basepatterns.creational.abstract_factory;

public interface ProjectTeamFactory {
    Developer createDeveloper();
    Tester createTester();
}
