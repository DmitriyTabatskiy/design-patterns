package net.basepatterns.structural.composite;

public class Project {

    public static void main(String[] args) {
        Team team = new Team();

        team.addDeveloper(new PythonDeveloper());
        team.addDeveloper(new PythonDeveloper());
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new JavaDeveloper());

        team.createProject();

    }
}
