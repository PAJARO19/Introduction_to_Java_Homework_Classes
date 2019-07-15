package Shared.Dom;

public class Room {

    double area;
    double height;

    public Room(double area, double height) {
        this.area = area;
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", height=" + height +
                '}';
    }
}
