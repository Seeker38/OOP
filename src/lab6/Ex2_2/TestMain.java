package lab6.Ex2_2;

public class TestMain {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        Cylinder cy2 = new Cylinder(1);
        Cylinder cy3 = new Cylinder(2, 3);
        System.out.println(cy1);
        System.out.println(cy2);
        System.out.println(cy3);
        cy3.setHeight(4);
        System.out.println(cy3);
        System.out.println("area: " + cy3.getArea());
        System.out.println("volume: " + cy3.getVolume());
    }
}
