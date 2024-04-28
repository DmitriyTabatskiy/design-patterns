package net.basepatterns.structural.decorator;

public class Task {

    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(
                        new SeniorJavaDeveloper(
                        new JavaDeveloper()));

        System.out.println(developer.createJob());

        Developer developer2 = new JavaTeamLead(new JavaDeveloper());
        System.out.println(developer2.createJob());


    }
}
