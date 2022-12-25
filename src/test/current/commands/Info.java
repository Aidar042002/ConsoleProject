package test.current.commands;

import test.current.CollectionManager;

public class Info extends AbstractCommand{
    private CollectionManager collectionManager;
    public Info(CollectionManager collectionManager) {
        super("info", "вывести информацию о коллекции");
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String argument) {

    }
}
