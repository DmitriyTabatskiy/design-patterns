package net.basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = getDeveloperFactoryBySpeciality("Java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory getDeveloperFactoryBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("C++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is not a valid speciality");
        }
    }
}
