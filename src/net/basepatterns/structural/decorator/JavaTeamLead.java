package net.basepatterns.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Java Team Lead sends week report";
    }

    @Override
    public String createJob() {
        return super.createJob() + sendWeekReport();
    }
}
