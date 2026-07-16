public class pattern4 {
    public static void main(String[] args) {
        String[] a = new String[] { "Hi", "I", "am", "learning", "java" };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                System.out.print(a[i].charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
