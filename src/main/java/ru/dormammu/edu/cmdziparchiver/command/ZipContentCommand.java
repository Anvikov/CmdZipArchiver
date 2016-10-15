package ru.dormammu.edu.cmdziparchiver.command;


import ru.dormammu.edu.cmdziparchiver.ConsoleHelper;
import ru.dormammu.edu.cmdziparchiver.FileProperties;
import ru.dormammu.edu.cmdziparchiver.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Просмотр содержимого архива.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Содержимое архива:");

        List<FileProperties> files = zipFileManager.getFilesList();
        for (FileProperties file : files) {
            ConsoleHelper.writeMessage(file.toString());
        }

        ConsoleHelper.writeMessage("Содержимое архива прочитано.");
    }
}
