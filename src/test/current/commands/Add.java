package test.current.commands;

import test.current.Checker;
import test.current.CollectionManager;
import test.current.parametrs.Product;

import java.time.LocalDateTime;

public class Add extends AbstractCommand{
    private CollectionManager collectionManager;
    private Checker checker;

    public Add(CollectionManager collectionManager, Checker checker) {
        super("add {element}", "добавить новый элемент в коллекцию");
        this.collectionManager = collectionManager;
        this.checker = checker;
    }

    @Override
    public void execute(String argument) {
        collectionManager.addToCollection(new Product(collectionManager.generateId(), checker.askName(),
                checker.askCoordinates(), LocalDateTime.now(), checker.askPrice(), checker.askPartNumber(),
                checker.askManufactureCost(), checker.askUnitOfMeasure(), checker.askManufacturer()));
        System.out.println("Element is adding");
    }
}
