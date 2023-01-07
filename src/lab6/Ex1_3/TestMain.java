package lab6.Ex1_3;

public class TestMain {
    public static void main(String[] args) {
        Point3D point3D1 = new Point3D();
        System.out.println(point3D1);
        Point3D point3D2 = new Point3D(1.1f, 6.6f, 4.4f);
        System.out.println(point3D2);

        point3D2.setX(2.2f);
        point3D2.setY(3.3f);
        point3D2.setZ(5.5f);
        System.out.println(point3D2);

        point3D2.setXY(1.1f, 6.6f);
        System.out.println(point3D2);

        point3D2.setXYZ(7.7f, 8.8f, 9.9f);
        System.out.println(point3D2);


    }
}
