package day45_Abstraction.shape;

public class Square extends Shape {
    
    private double side;

    public Square(double side) {
        super("Square");
        setside(side);
    }

    public double getside() {
        return side;
    }

    public void setside(double side) {
        if (side <=0){
            throw new RuntimeException("Invalid side: " + side);
        }
        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
