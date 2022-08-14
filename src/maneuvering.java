import java.util.Scanner;

public class maneuvering {

    static int noofPaths(int m, int n)
    {

        if (m == 1 || n == 1)
            return 1;

        return noofPaths(m - 1, n) + noofPaths(m, n - 1);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the Test Cases");
        c= sc.nextInt();

        while(c-->0)
        {
            System.out.println("Enter the number of rows and columns");

            a= sc.nextInt();
            b= sc.nextInt();
            System.out.println(noofPaths(a,b));

        }


    }
}

