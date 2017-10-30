package murach.rectangle;

public class Rectangle {
    double width;
    double length;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
        // this(0.0, 0.0);
    }
    
    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    double getWidth() {
        return this.width;
    }

    double getLength() {
        return this.length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        double area = this.width * this.length;
        return area;
    }

    double getPerimeter() {
        double perimeter = 2 * this.width + 2 * this.length;
        return perimeter;
    }
}
