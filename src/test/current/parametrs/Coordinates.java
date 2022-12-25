package test.current.parametrs;

public class Coordinates {
    private Long x; //Поле не может быть null
    private float y;

    public Coordinates(){}

    public Coordinates(Long x, float y){
        this.x =x;
        this.y =y;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
