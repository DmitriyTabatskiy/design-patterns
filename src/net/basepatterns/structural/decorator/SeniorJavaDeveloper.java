package net.basepatterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return " Make code review; ";
    }

    @Override
    public String createJob() {
        return super.createJob() + makeCodeReview();
    }
}
