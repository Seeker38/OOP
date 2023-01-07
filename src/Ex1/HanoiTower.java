package Ex1;

public class HanoiTower {
    public static void main(String[] args) {
        hanoiTower(3    , 1, 3, 2);

    }

    static void hanoiTower(int n, int start, int end, int mid) {
        if (n == 1) {
            System.out.println("Chuyen dia 1 tu cot " + start + " sang cot " + end);
        } else {
            hanoiTower(n - 1, start, mid, end);
            System.out.println("Chuyen dia " + n + " tu cot " + start + " sang cot " + end);
            hanoiTower(n - 1, mid, end, start);
        }
    }
}
