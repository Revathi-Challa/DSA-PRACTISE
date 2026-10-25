public class pattern4 {
    public static void main(String[] args) {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int space = size - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int symbol = 1; symbol <= 2 * row - 1; symbol++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = size - 1; row >= 1; row--) {
            for (int space = size - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int symbol = 1; symbol <= 2 * row - 1; symbol++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


