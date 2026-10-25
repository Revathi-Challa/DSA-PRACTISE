public class pattern3 {
    public static void main(String[] args) {
        int size = 5;

        for (int row = 0; row < size; row++) {
            int spaces = Math.min(row, size - 1 - row);
            int stars = size - 2 * spaces;

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


