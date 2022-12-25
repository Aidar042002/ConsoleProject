package test.current;

import test.current.parametrs.*;

import java.util.Scanner;

public class Checker {
    Scanner userScanner = new Scanner(System.in);
    Product product;
    CollectionManager collectionManager;

    public String askName(){
        while(true){
        String name;
        System.out.println("Введите имя:");
        name = userScanner.next();
        return name;}
    }

    public Long askX(){
        while (true){
        try {
            Long x;
            System.out.println("Введите координату (Long)x:");
            x = userScanner.nextLong();
            return x;
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public float askY(){
        while(true){
        float y;
        System.out.println("Введите координату y(float):");
        y = userScanner.nextFloat();
        return y;}
    }

    public Coordinates askCoordinates(){
        Long x;
        float y;
        x = askX();
        y = askY();
        return new Coordinates(x,y);
    }

    public float askPrice(){
        while (true){
        float price;
        System.out.println("Введите price(float):");
        price = userScanner.nextFloat();
        return price;}
    }

    public String askPartNumber(){
        while (true){
        String partNumber;
        System.out.println("Введите part_number(String):");
        partNumber = userScanner.next();
        return partNumber;}
    }

    public long askManufactureCost(){
        while (true){
        long manufactureCost;
        System.out.println("Введите manufacture_cost(long):");
        manufactureCost = userScanner.nextLong();
        return manufactureCost;}
    }

    public UnitOfMeasure askUnitOfMeasure() {
        String unit;
        UnitOfMeasure unitOfMeasure;
        while (true){
           try {
               System.out.println("Список unitOfMeasure: "+UnitOfMeasure.unitOfMeasureList());
               System.out.println("Введите unitOfMeasure:");
               unit=userScanner.next();
               unitOfMeasure= UnitOfMeasure.valueOf(unit);
               break;
           } catch(Exception e){
               e.printStackTrace();
           }
        }
        return unitOfMeasure;
    }

    public int generateOrganizationId(){
        return CollectionManager.getLastId();
    }

    public String askOrganizationName(){
        while (true){
        String name;
        System.out.println("Введите имя организации:");
        name = userScanner.next();
        return name;}
    }

    public String askFullName(){
        while (true){
        String fullName;
        System.out.println("Введите полное имя организации:");
        fullName = userScanner.next();
        return fullName;}
    }

    public OrganizationType askOrganizationType(){
        String str;
        OrganizationType organizationType;
        while (true){
        System.out.println("Список OrganizationType: "+OrganizationType.organizationTypeList());
        System.out.println("Введите organization_type:");
        str=userScanner.next().trim();
        organizationType = OrganizationType.valueOf(str);
        return organizationType;}
    }

    public String askZipCode(){
        while(true){
        String zipCode;
        System.out.println("Введите zipCode(String):");
        zipCode = userScanner.next();
        return zipCode;}
    }

    public Long askLocationTownX(){
        while (true){
        Long x;
        System.out.println("Введите координату x(town):");
        x = userScanner.nextLong();
        return x;}
    }

    public float askLocationTownY(){
        while (true){
        float y;
        System.out.println("Введите координату y(town):");
        y = userScanner.nextFloat();
        return y;}
    }

    public Integer askLocationTownZ(){
        while (true){
        Integer z;
        System.out.println("Введите координату z(town):");
        z = userScanner.nextInt();
        return z;}
    }

    public Location askLocation(){
        Long x;
        float y;
        Integer z;
        x = askLocationTownX();
        y = askLocationTownY();
        z = askLocationTownZ();
        return new Location(x,y,z);
    }

    public Address askAddress(){
        String zipCode;
        Location town;
        zipCode = askZipCode();
        town = askLocation();
        return new Address(zipCode, town);
    }

    public Organization askManufacturer(){
        Long id;
        String name;
        String fullName;
        OrganizationType organizationType;
        Address postalAddress;
        id = Long.valueOf(generateOrganizationId());
        name = askOrganizationName();
        fullName = askFullName();
        organizationType = askOrganizationType();
        postalAddress = askAddress();
        return  new Organization(id, name, fullName, organizationType, postalAddress);
    }
}
