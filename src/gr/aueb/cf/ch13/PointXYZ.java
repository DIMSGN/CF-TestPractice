package gr.aueb.cf.ch13;

public class PointXYZ extends PointXY{
    private int z;

    public PointXYZ() {

    }

    public PointXYZ(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public PointXYZ(int x, int y) {
        super(x, y);
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    public double getYZDistance() {
        int y = getY();
        int z = getZ();
        return Math.sqrt(y * y + z * z);
    }

    public double getXZDistance() {
        int x = getX();
        int z = getZ();
        return Math.sqrt(x * x + z * z);
    }

    public double getXYZDistance() {
        int y = getY();
        int z = getZ();
        int x =  getX();
        return Math.sqrt(x * x + y * y + z * z);
    }

}
