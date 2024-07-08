public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(4 * Math.PI * (radius*radius), radius);
    }

    public double getVolume() {
        double radius = getRadius();
        double volume = 4 * Math.PI * (radius*radius);
        return super.getVolume();
    }
}
