package net.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Developer> developers = new ArrayList<Developer>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject(){
        System.out.println("Creating project ...");

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
