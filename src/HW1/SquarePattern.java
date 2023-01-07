import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();

        for (int row=1; row <= size; row ++){
            for (int col = 1; col <= size ; col ++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
    public static void try_1(String[] args){
        int size =3;
        int col=0, row=0;
        while  (col < size) {
            while (row < size) {
                System.out.print("#");
                row++;
            }
            col++;
            System.out.println();
            row = 0;
        }
    }

}
