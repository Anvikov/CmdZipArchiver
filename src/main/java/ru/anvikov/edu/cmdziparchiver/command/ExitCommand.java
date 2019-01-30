package ru.anvikov.edu.cmdziparchiver.command;


import ru.anvikov.edu.cmdziparchiver.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
