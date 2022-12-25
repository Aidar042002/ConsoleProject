package test.current;

import test.current.commands.*;
import test.current.exception.InputException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InputException {
        String path = null;

        if(args == null || args.length==0){
            System.out.println("Файл не введен");
        } else {
            path = args[0];
        }

        Checker checker = new Checker();
        FileControl fileControl = new FileControl(path);
        CollectionManager collectionManager = new CollectionManager(fileControl);
        CommandManager commandManager = new CommandManager(new Add(collectionManager, checker),
                new AddIfMax(collectionManager,checker),
                new ExecuteScript(new CommandManager()),
                new Exit(), new Clear(collectionManager),new FilterStartsWithPartNumber(collectionManager),
                new Help(new CommandManager()), new History(new CommandManager()),
                new Info(collectionManager),
                new MinByName(collectionManager), new RemoveById(collectionManager), new RemoveGreater(collectionManager, checker),
                new Save(collectionManager),
                new Show(collectionManager),
                new SumOfManufactureCost(collectionManager), new Update(collectionManager, checker));
        UserScanner userScanner = new UserScanner(commandManager, checker);
         userScanner.enterCommand();
    }
}
