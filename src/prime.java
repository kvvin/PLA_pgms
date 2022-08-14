import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        System.out.println("enter n");
        n = sc.nextInt();
        boolean a[] = new boolean[n];

        for (i = 0; i < a.length; i++) {
            a[i] = true;
        }
        for (i = 2; i<=Math.sqrt(n); i++) {
            if (a[i] = true) {
                for (j = i * i; j < n; j = j + i) {
                    a[j] = false;
                }
            }
        }
        System.out.println("The prime numbers are:");
        for (i = 2; i < a.length; i++) {
            if (a[i] == true) {
                System.out.println(i);
            }
        }
    }
}




/*import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();
        boolean []a = new boolean[n];

        for(i=0; i<a.length;i++) {
            a[i] = true;
        }
            for (i = 2; i<Math.sqrt(n); i++) {
                if (a[i] == true) {
                    for (j = i * i; j < n; j = j+i) {
                        a[j] = false;
                    }
                }
            }

        System.out.println("Prime numbers are: ");
        for(i=2;i<a.length;i++)
        {
            if(a[i]==true)
            {
                System.out.println(i + " ");
            }
        }

    }

}
*/