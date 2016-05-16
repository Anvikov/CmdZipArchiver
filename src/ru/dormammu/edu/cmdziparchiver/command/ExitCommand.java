package ru.dormammu.edu.cmdziparchiver.command;


import ru.dormammu.edu.cmdziparchiver.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
