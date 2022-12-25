package test.current.commands;

import test.current.Checker;
import test.current.CollectionManager;

public class RemoveGreater extends AbstractCommand{
    private CollectionManager collectionManager;
    private Checker checker;

    public RemoveGreater(CollectionManager collectionManager, Checker checker) {
        super("remove_greater {element}:", " удалить из коллекции все элементы, превышающие заданный");
        this.collectionManager = collectionManager;
        this.checker = checker;
    }

    @Override
    public void execute(String argument) {

    }
}
