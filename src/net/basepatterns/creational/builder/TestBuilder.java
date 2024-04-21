package net.basepatterns.creational.builder;

public class TestBuilder {
    public static void main(String[] args) {
        //Building the object of Employee thru the build() method provided in EmployeeBuilder class.
        Employee employee = new Employee.EmployeeBuilder(
                "Vikram", "ABC")
                .setHasBike(true)
                .setHasCar(true)
                .build();

        System.out.println(employee);
    }
}
