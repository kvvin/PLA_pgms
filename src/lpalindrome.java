import java.io.*;

public class lpalindrome {

    static char n = 26;

    static void freq(String str, int freq[], int len) {
        for (int i = 0; i < len; i++) {
            freq[str.charAt(i) - 'a']++;
        }
    }

        static boolean palindromeornot(int freq[],int len){

        int count_odd=0;
        for(int i = 0; i<n; i++)
        {
            if(freq[i]%2!=0)
            {
                count_odd++;
            }
        }
        if (len % 2 == 0)
        {
            if(count_odd>0)
            {
                return false;
            }
            else {
                return true;

            }
        }
        if(count_odd!=1)
        {
            return false;
        }
        return true;
    }
    static String remfreq(int freq[]) {
        String oddstr = "";
        for (int i = 0; i < n; i++) {
            if (freq[i] % 2 != 0) {
                freq[i]--;
                oddstr = oddstr + (char) +(i + 'a');
                return oddstr;
            }
        }
        return oddstr;
    }
    static String findpalindrome(String str)
    {
        int len = str.length();
        int freq[] =new int[n];
        freq(str, freq, len);
        if (!palindromeornot(freq, len))
        {
            return "No Palindromic String";
        }
        String odd_str = remfreq(freq);

        String front_str = "", rear_str = " ";
        for (int i = 0; i < n; i++)
        {
            String temp = "";
            if (freq[i] != 0)
            {
                char ch = (char) (i + 'a');

                for (int j = 1; j <= freq[i] / 2; j++)
                {
                    temp = temp + ch;
                }
                front_str = front_str + temp;

                rear_str = temp + rear_str;
            }
        }

        return (front_str + odd_str + rear_str);
    }
    public static void main(String[] args)
    {
        String str = "malayalam";
        System.out.println(findpalindrome(str));
    }
}



