import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1 || column == 0 || column == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}