package test.current.commands;

import test.current.CommandManager;

public class History extends AbstractCommand{
    CommandManager commandManager;
    public History(CommandManager commandManager) {
        super("history", "вывести историю использованных команд");
        this.commandManager = commandManager;
    }

    @Override
    public void execute(String argument) {
        for (String command : commandManager.getCommandHistory()) {
            System.out.println(command);
        }
    }
}
