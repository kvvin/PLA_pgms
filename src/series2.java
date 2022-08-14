import java.util.Scanner;

public class series2 {
    public static void main(String[] args) {
        double n, i,now=System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println(Math.pow(11+4*i,2));

        }
        System.out.println("Time Taken = " + (System.currentTimeMillis()-now));

    }
}
