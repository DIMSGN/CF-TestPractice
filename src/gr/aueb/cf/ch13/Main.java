package gr.aueb.cf.ch13;

public class Main {
    public static void main(String[] args) {

        PointXYZ pointXYZ= new PointXYZ(3, 4, 5);

        double xyDist = pointXYZ.getXYDistance();
        double xzDist = pointXYZ.getXZDistance();
        double yzDist = pointXYZ.getYZDistance();
        double xyzDist = pointXYZ.getXYZDistance();

        System.out.println("XY Distance: " + xyDist);
        System.out.println("XZ Distance: " + xzDist);
        System.out.println("YZ Distance: " + yzDist);
        System.out.println("XYZ Distance: " + xyzDist);


    }


}
