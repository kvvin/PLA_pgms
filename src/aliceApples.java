public class aliceApples {
    static int minApples(int m, int k, int n, int s, int w, int e) {
        if (m < s * k)
            return m;

        else if (m <= s * k + e + w)
            return s * k + (m - s * k) * k;

        else
            return -1;
    }

    public static void main(String[] args) {
        int m =100, k=10, n= 40, s= 0, w=1, e=0;
        int ans = minApples(m,k,n,s,w,e);
        System.out.println("The answer is " + ans);
    }
    }
