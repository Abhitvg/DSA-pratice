import java.util.*;

public class primenumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int flag = 0;

        for (int i = 2; i <= num - 1; i = i + 1) {
            if (num % i == 0) {
                System.out.println("it's not a prime number");
                System.out.println(i);
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 0) {
            System.out.println("it's a prime number");
        }
    }
}
