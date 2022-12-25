package test.current.commands;

import test.current.CollectionManager;
import test.current.parametrs.Product;

public class SumOfManufactureCost extends AbstractCommand{
    private CollectionManager collectionManager;

    public SumOfManufactureCost(CollectionManager collectionManager) {
        super("sum_of_manufacture_cost", "вывести сумму значений поля manufactureCost для всех элементов коллекции");
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String argument) {
        long manufactureCost=0;
        for (Product product: collectionManager.getProducts()){
            manufactureCost =manufactureCost+product.getManufactureCost();
        }
        System.out.println("Manufacturer cost: "+manufactureCost);
    }
}
