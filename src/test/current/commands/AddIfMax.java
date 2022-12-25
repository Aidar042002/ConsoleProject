package test.current.commands;

import test.current.Checker;
import test.current.CollectionManager;

public class AddIfMax extends AbstractCommand{
    private CollectionManager collectionManager;
    private Checker checker;

    public AddIfMax(CollectionManager collectionManager, Checker checker) {
        super("add_if_max {element}", "добавить новый элемент в коллекцию, если его значение " +
                "превышает значение наибольшего элемента этой коллекции");
        this.collectionManager = collectionManager;
        this.checker = checker;
    }

    @Override
    public void execute(String argument) {

    }
}
