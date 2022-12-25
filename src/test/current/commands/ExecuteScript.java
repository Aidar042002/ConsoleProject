package test.current.commands;

import test.current.CommandManager;
import test.current.UserScanner;

public class ExecuteScript extends AbstractCommand{
    CommandManager commandManager;
    public ExecuteScript(CommandManager commandManager) {
        super("execute_script file_name","считать и исполнить скрипт из указанного файла. " +
                "В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме");
        this.commandManager =commandManager;
    }

    @Override
    public void execute(String argument) {
        commandManager.scriptComplete(argument);
    }
}
