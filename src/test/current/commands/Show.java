package test.current.commands;

import test.current.CollectionManager;

public class Show extends AbstractCommand{
    private CollectionManager collectionManager;

    public Show(CollectionManager collectionManager) {
        super("show", "вывести все элементы коллекции");
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String argument) {
        if (collectionManager.showCollection().isEmpty()){
            System.out.println("Коллекция пуста");
        }else{
            System.out.println(collectionManager.showCollection());
        }
    }
}
