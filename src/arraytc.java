import java.util.Scanner;
public class arraytc {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        int n = 10, i, sum = 0;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Time Taken = " + (System.currentTimeMillis()-now));
    }
}
