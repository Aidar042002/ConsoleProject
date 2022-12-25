package test.current.commands;

import test.current.CollectionManager;

public class FilterStartsWithPartNumber extends AbstractCommand{
    private CollectionManager collectionManager;

    public FilterStartsWithPartNumber(CollectionManager collectionManager) {
        super("filter_starts_with_part_number partNumber", "вывести элементы, значение " +
                "поля partNumber которых начинается с заданной подстроки");
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String argument) {

    }
}
