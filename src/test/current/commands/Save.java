package test.current.commands;

import test.current.CollectionManager;

public class Save extends AbstractCommand{
    private CollectionManager collectionManager;
    public Save(CollectionManager collectionManager) {
        super("save", "сохранить коллекцию в файл");
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String argument) {

    }
}
