package test.current.parametrs;

public class Address {
    private String zipCode; //Поле может быть null
    private Location town; //Поле может быть null

    public Address(){}

    public Address(String zipCode, Location town) {
        this.zipCode = zipCode;
        this.town = town;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Location getTown() {
        return town;
    }

    public void setTown(Location town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode='" + zipCode + '\'' +
                ", town=" + town +
                '}';
    }
}
