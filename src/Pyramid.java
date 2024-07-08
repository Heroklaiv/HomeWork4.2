import java.util.Scanner;

public class Pyramid extends Shape {
    double h;
    double s;

    public Pyramid(double s, double h) {
        super(0.5 * s * h);
        this.h = h;
        this.s = s;
    }


}
