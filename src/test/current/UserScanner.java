package test.current;

import test.current.commands.Add;
import test.current.commands.Command;
import test.current.commands.Help;
import test.current.exception.InputException;
import test.current.parametrs.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserScanner {
    Checker checker;
    CommandManager commandManager;
    public static ArrayList<String> userCommands = new ArrayList<>();
    Scanner userScanner = new Scanner(System.in);

    public UserScanner(CommandManager commandManager, Checker checker) {
        this.checker = checker;
        this.commandManager = commandManager;
    }

    public void enterCommand() throws IOException, InputException {
        while (true) {
            String[] currentCommand = {"", ""};
            System.out.println("Введите команду:");
            currentCommand = userScanner.nextLine().trim().split(" ", 2);
            if (currentCommand.length == 2) commandManager.chooseCommand(currentCommand[0], currentCommand[1]);
            else if (currentCommand.length == 1) commandManager.chooseCommand(currentCommand[0], null);
            else if (currentCommand.length>2)   System.out.println("Not command");
        }
    }

    public void executeScript(String argument){
        String filePath =argument;
        try {
            File file=new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                for(Command command : commandManager.getCommands()) {
                    String[] currentArray = {"", ""};
                    currentArray = line.trim().split(" ", 2);
                    String executeLine=currentArray[0];
                    if(executeLine.trim().equals(command)){
                        command.execute(currentArray[1]);
                    }
                }
                // считываем остальные строки в цикле
                line = reader.readLine();}
        }catch (FileNotFoundException exception){
            exception.printStackTrace();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
