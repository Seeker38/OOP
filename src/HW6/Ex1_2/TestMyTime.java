package HW6.Ex1_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        MyTime t2 = new MyTime(12, 34, 23);
        System.out.println(t1);
        System.out.println(t2);

        t2.setTime(23, 56, 76);
        t2.setTime(22, 34, 45);
        System.out.println(t2);
        t2.setSecond(59);
        System.out.println(t2);
        t2.setMinute(59);
        System.out.println(t2);
        t2.setHour(23);
        System.out.println(t2);

        t2.nextHour();
        System.out.println(t2);
        t2.nextMinue();
        System.out.println(t2);
        t2.nextSecond();
        System.out.println(t2);
        System.out.println();

        t2.previousHour();
        System.out.println(t2);
        t2.previousMinute();
        System.out.println(t2);
        t2.previousSecond();
        System.out.println(t2);

    }
}
