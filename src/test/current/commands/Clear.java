package test.current.commands;

import test.current.CollectionManager;

public class Clear extends AbstractCommand{
    private CollectionManager collectionManager;

    public Clear(CollectionManager collectionManager) {
        super("clear", "очистить коллекцию");
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String argument) {
        collectionManager.clearCollection();
        System.out.println("Коллекция очищена");
    }
}
