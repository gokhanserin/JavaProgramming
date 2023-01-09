package day45_Abstraction.shape;

public class Rectangle extends Shape {

    private double wide;
    private double length;

    public Rectangle(double wide, double length) {
        super("Rectangle");
        setWide(wide);
        setLength(length);
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        if (wide<=0){
            throw new RuntimeException("Invalid wide: " +wide);
        }
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            throw new RuntimeException("Invalid length: " + length);
        }
        this.length = length;
    }

    @Override
    public double area() {
        return wide*length;
    }

    @Override
    public double perimeter() {
        return 2*(wide+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                "wide=" + wide +
                ", length=" + length +
                '}';
    }
}
