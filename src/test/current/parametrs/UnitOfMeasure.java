package test.current.parametrs;

public enum UnitOfMeasure {
    SQUARE_METERS,
    PCS,
    LITERS,
    GRAMS;

    public static String unitOfMeasureList(){
        String names = "";
        for(UnitOfMeasure unitOfMeasure : values()){
            names+=unitOfMeasure+" ";
        }
        return names;
    }
}
