package net.basepatterns.structural.bridge;

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Develop Stock Exchange");
        developer.writeCode();
    }
}
