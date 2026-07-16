public class pattern3 {

    public static void main(String[] args) {

        int a = 20;

        for (int i = 1; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j <= i) {
                    System.out.print(j + 0 + " ");
                }
            }
            System.out.println();
        }

    }
}