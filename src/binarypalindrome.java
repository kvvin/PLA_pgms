public class binarypalindrome {
    public static void main(String[] args) {
        long num = 1,n1;
        long rev = 0;

        n1 = num;
        while (n1 > 0) {
            rev <<= 1;
            if ((n1 & 1) == 1)
                rev ^= 1;
                n1 >>= 1;

        }
            if (num == rev)
                System.out.println("Binary representation of " + num + " is palindrome");

            else
                System.out.println("Binary representation of " + num + " is not palindrome");

        }
    }
