package test.current.commands;

import test.current.Checker;
import test.current.CollectionManager;
import test.current.parametrs.Coordinates;
import test.current.parametrs.Organization;
import test.current.parametrs.Product;
import test.current.parametrs.UnitOfMeasure;

import java.time.LocalDateTime;

public class Update extends AbstractCommand{
    private CollectionManager collectionManager;
    private Checker checker;

    public Update(CollectionManager collectionManager, Checker checker) {
        super("update id {element}", "обновить значение элемента коллекции, id которого равен заданному");
        this.collectionManager = collectionManager;
        this.checker = checker;
    }

    @Override
    public void execute(String argument) {
        int id = Integer.valueOf(argument);
        if(collectionManager.getSizeProducts()==0){
            System.out.println("collection is empty");;}
        Product product = collectionManager.getBYId(id);
        String name = product.getName();
        Coordinates coordinates =product.getCoordinates();
        float price= product.getPrice();
        String partNumber = product.getPartNumber();
        long manufactureCost = product.getManufactureCost();
        UnitOfMeasure unitOfMeasure=product.getUnitOfMeasure();
        Organization manufacturer = product.getManufacturer();

        collectionManager.removeCollection(product);

        name = checker.askName();
        coordinates = checker.askCoordinates();
        price = checker.askPrice();
        partNumber = checker.askPartNumber();
        manufactureCost = checker.askManufactureCost();
        unitOfMeasure = checker.askUnitOfMeasure();
        manufacturer = checker.askManufacturer();

        collectionManager.addToCollection(new Product(id, name, coordinates, LocalDateTime.now(), price, partNumber,
                manufactureCost, unitOfMeasure,manufacturer));
        System.out.println("Element is update");

    }
}
