package Shared.Dom;

public class Kitchen extends Room {

    public Kitchen(double area, double height) {
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
        return "Kitchen{" +
                "area=" + area +
                ", height=" + height +
                '}';
    }
}
