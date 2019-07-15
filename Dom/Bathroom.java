package Shared.Dom;

public class Bathroom extends Room {

    public Bathroom(double area, double height) {
        super(area, height);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "area=" + area +
                ", height=" + height +
                '}';
    }
}
