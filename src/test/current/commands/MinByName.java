package test.current.commands;

import test.current.CollectionManager;
import test.current.parametrs.Product;

public class MinByName extends AbstractCommand{
    private CollectionManager collectionManager;

    public MinByName(CollectionManager collectionManager) {
        super("min_by_name", "вывести любой объект из коллекции, значение поля name которого является минимальным");
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String argument) {

    }
}
