package test.current.commands;

import test.current.CollectionManager;
import test.current.parametrs.Product;

public class RemoveById extends AbstractCommand{
    private CollectionManager collectionManager;

    public RemoveById(CollectionManager collectionManager) {
        super("remove_by_id id", "удалить элемент из коллекции по его id");
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String argument) {
        int id = Integer.valueOf(argument);
        Product product = collectionManager.getBYId(id);
        collectionManager.removeCollection(product);
    }
}
