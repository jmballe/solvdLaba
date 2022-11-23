package hospital;

public class Room {
    private int id;
    private double width;
    private double length;

    public Room() {
    }

    public Room(int id, double width, double length) {
        this.id = id;
        this.width = width;
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
