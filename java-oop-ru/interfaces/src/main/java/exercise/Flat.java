package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return this.area + this.balconyArea;
    }

    @Override
    public int compareTo(Home home) {
        if (this.getArea() > home.getArea()) {
            return 1;
        } else if (this.getArea() < home.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        //return "Квартира площадью " + this.getArea() + " метров на " + this.floor + " этаже";
        return String.format("Квартира площадью %s метров на %d этаже", getArea(), floor);
    }
}
// END
