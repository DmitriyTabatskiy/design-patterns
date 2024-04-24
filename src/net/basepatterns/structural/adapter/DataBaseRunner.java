package net.basepatterns.structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.remove();
        database.select();
        database.update();

    }
}
