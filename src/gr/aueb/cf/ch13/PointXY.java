package gr.aueb.cf.ch13;

public abstract class PointXY extends PointX {
    private int y;

    public PointXY() {

    }
    public PointXY(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PointXY(int x) {
        super(x);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    public double getXYDistance() {
        double x = getX();
        return Math.sqrt(x * x + y * y);
    }
}
