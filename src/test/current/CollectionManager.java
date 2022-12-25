package test.current;

import test.current.parametrs.Product;

import java.util.LinkedHashSet;

public class CollectionManager {
    private static LinkedHashSet<Product> products= new LinkedHashSet<>();
    private FileControl fileControl;
    private Product product;
    int currentId;
    private static int lastId;

    public CollectionManager(FileControl fileControl) {
        this.fileControl = fileControl;
    }

    public int getSizeProducts() {
        //return size
        return products.size();
    }

    /**
    @return collection
     */
    public LinkedHashSet<Product> getProducts() {
        return products;
    }

    public int generateId(){
        if (products.isEmpty()){
            lastId =1;
            return 1;
        } else{
            lastId++;
            return products.size()+1;
        }
    }

    public static int getLastId() {
        return lastId;
    }

    public Product getBYId(int id){
        for (Product product : products) {
            if (product.getId() == id) return product;
        }
        return null;
    }

    public void addToCollection(Product product){
        products.add(product);
    }

    public void clearCollection(){
        products.clear();
    }

    public void removeCollection(Product product){
        products.remove(product);
    }

    public LinkedHashSet<Product> showCollection(){
        return products;
    }
}
