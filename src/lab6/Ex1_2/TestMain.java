package lab6.Ex1_2;

public class TestMain {
    public static void main(String[] args) {
        Student student1 = new Student("hieu", "hanoi", "tin", 2022, 2000.4);
        System.out.println(student1);

        student1.setFee(222222);
        student1.setProgram("abc");
        student1.setYear(2023);
        student1.setAddress("VN");
        System.out.println(student1);

        Staff staff1 = new Staff("hieu", "hanoi", "khtn", 23221322.432);
        System.out.println(staff1);

        staff1.setPay(112);
        staff1.setAddress("VN");
        staff1.setSchool("khoa hoc tu nhien");
        System.out.println(staff1);
    }
}
