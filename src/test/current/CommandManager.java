package test.current;

import test.current.commands.Command;

import java.util.ArrayList;
import java.util.Objects;

public class CommandManager {
    private final int COMMAND_HISTORY = 14;
    private static ArrayList<Command> commands = new ArrayList<>();
    private static ArrayList<String> commandHistory=new ArrayList<>();
    UserScanner userScanner;
    private Command add;
    private Command addIfMax;
    private Command executeScript;
    private Command exit;
    private Command clear;
    private Command filterStartsWithPartNumber;
    private Command help;
    private Command history;
    private Command info;
    private Command minByName;
    private Command removeById;
    private Command removeGreater;
    private Command save;
    private Command show;
    private Command sumOfManufactureCost;
    private Command updateId;

    public CommandManager(Command add, Command addIfMax, Command executeScript,
                          Command exit, Command clear, Command filterStartsWithPartNumber, Command help,
                          Command history, Command info, Command minByName, Command removeById, Command removeGreater,
                          Command save, Command show, Command sumOfManufactureCost, Command updateId) {
        this.add = add;
        this.addIfMax = addIfMax;
        this.executeScript = executeScript;
        this.exit = exit;
        this.clear = clear;
        this.filterStartsWithPartNumber = filterStartsWithPartNumber;
        this.help = help;
        this.history = history;
        this.info = info;
        this.minByName = minByName;
        this.removeById = removeById;
        this.removeGreater = removeGreater;
        this.save = save;
        this.show = show;
        this.sumOfManufactureCost = sumOfManufactureCost;
        this.updateId = updateId;

        commands.add(help);
        commands.add(add);
        commands.add(addIfMax);
        commands.add(executeScript);
        commands.add(exit);
        commands.add(clear);
        commands.add(filterStartsWithPartNumber);
        commands.add(history);
        commands.add(info);
        commands.add(minByName);
        commands.add(removeById);
        commands.add(save);
        commands.add(show);
        commands.add(sumOfManufactureCost);
        commands.add(updateId);
    }

    public CommandManager(){}

    public void showHistory(){
        for(String command:commandHistory){
            System.out.println(command);
        }
    }

    public void chooseCommand(String currentCommand, String commandArgument) {
         for (Command command : commands) {
             String[] userCommands = {"", ""};
             userCommands =command.getName().trim().split(" ", 2);
             String userChooseCommand = userCommands[0];
             if(userChooseCommand.trim().equals(currentCommand.trim())) {
                 command.execute(commandArgument);
                 if(commandArgument==null) commandHistory.add(currentCommand);
                 else{ commandHistory.add(currentCommand + " "+commandArgument);}
             }
        }
    }

    public ArrayList<Command> getCommands(){
        return commands;
    }

    public void scriptComplete(String argument){
        userScanner.executeScript(argument);
    }

    public ArrayList<String> getCommandHistory() {
        return commandHistory;
    }
}
