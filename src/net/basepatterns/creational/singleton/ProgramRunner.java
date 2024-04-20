package net.basepatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Program Started");
        ProgramLogger.getProgramLogger().showLogFile();
        ProgramLogger.getProgramLogger().addLogInfo("First log");
        ProgramLogger.getProgramLogger().showLogFile();
        ProgramLogger.getProgramLogger().addLogInfo("Second log");
        ProgramLogger.getProgramLogger().showLogFile();
        ProgramLogger.getProgramLogger().addLogInfo("Third log");
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
