package test.current.parametrs;

public class Location {
    private Long x; //Поле не может быть null
    private float y;
    private Integer z; //Поле не может быть null

    public Location(Long x, float y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
