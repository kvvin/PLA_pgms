import java.util.*;


public class series {
    public static void main(String[] args) {

        int i;
        double n, now = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println(Math.pow(3,i));
        }
        System.out.println("Time Taken = " + (System.currentTimeMillis()-now));

    }
}
