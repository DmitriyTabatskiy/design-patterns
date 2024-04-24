package net.basepatterns.structural.bridge;


public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new BankSystem(new PythonDeveloper()),
                new StockExchange(new PythonDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
            System.out.println("===============================================");
        }
    }
}
