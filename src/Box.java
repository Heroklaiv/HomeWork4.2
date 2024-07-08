public class Box extends Shape {
    public Box(double volume) {
        super(volume);
    }

    public boolean add(Shape shape) {
        double volumeFigure = shape.getVolume();
        if (volumeFigure < getVolume()) {
            return true;
        }
        return false;
    }

}
