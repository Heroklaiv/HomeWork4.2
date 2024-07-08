import java.util.Scanner;

public class Cyliinder extends SolidOfRevolution {
    double heght;

    public Cyliinder(double radius, double heght) {
        super(2 * Math.PI * radius * (radius + heght), radius);
        this.heght = heght;
    }

}




