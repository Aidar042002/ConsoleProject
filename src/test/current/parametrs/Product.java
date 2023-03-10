package test.current.parametrs;

import java.time.LocalDateTime;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float price; //Значение поля должно быть больше 0
    private String partNumber; //Поле может быть null
    private long manufactureCost;
    private UnitOfMeasure unitOfMeasure; //Поле не может быть null
    private Organization manufacturer; //Поле может быть null

    public Product(int id, String name, Coordinates coordinates, LocalDateTime creationDate, float price,
        String partNumber, long manufactureCost, UnitOfMeasure unitOfMeasure, Organization manufacturer) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.price = price;
        this.partNumber = partNumber;
        this.manufactureCost = manufactureCost;
        this.unitOfMeasure = unitOfMeasure;
        this.manufacturer = manufacturer;
    }

    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public long getManufactureCost() {
        return manufactureCost;
    }

    public void setManufactureCost(long manufactureCost) {
        this.manufactureCost = manufactureCost;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Organization getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Organization manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", price=" + price +
                ", partNumber='" + partNumber + '\'' +
                ", manufactureCost=" + manufactureCost +
                ", unitOfMeasure=" + unitOfMeasure +
                ", manufacturer=" + manufacturer +
                '}'+"\n";
    }

    public String infoString(){
        return "id:"+id+'\n'+
                "name:" +name +'\n'+
                "coordinates:"+coordinates+'\n'+
                "creationDate:" + creationDate +'\n'+
                "price:" + price+'\n'+
                "partNumber:"+partNumber+'\n'+
                "manufactureCost:" + manufactureCost+'\n'+
                "unitOfMeasure:" +unitOfMeasure+'\n'+
                "manufacturer:" +manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId() && Float.compare(product.getPrice(), getPrice()) == 0 && getManufactureCost() == product.getManufactureCost() && Objects.equals(getName(), product.getName()) && Objects.equals(getCoordinates(), product.getCoordinates()) && Objects.equals(getCreationDate(), product.getCreationDate()) && Objects.equals(getPartNumber(), product.getPartNumber()) && getUnitOfMeasure() == product.getUnitOfMeasure() && Objects.equals(getManufacturer(), product.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCoordinates(), getCreationDate(), getPrice(), getPartNumber(), getManufactureCost(), getUnitOfMeasure(), getManufacturer());
    }

    @Override
    public int compareTo(Product o) {
        return o.getId();
    }
}
