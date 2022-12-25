package test.current.commands;

import test.current.CollectionManager;
import test.current.CommandManager;

public class Help extends AbstractCommand{
    CommandManager commandManager;
    public Help(CommandManager commandManager){
        super("help", "вывести справку по доступным командам");
        this.commandManager = commandManager;
    }

    @Override
    public void execute(String argument) {
        for (Command command : commandManager.getCommands()) {
            System.out.println(command.getName()+" : "+command.getDescription());
        }
    }
}
