package net.basepatterns.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is lof file. \n\n";

    private ProgramLogger() {
    }

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }

        return programLogger;
    }

    public void addLogInfo(String log) {
        logFile += log + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }

}