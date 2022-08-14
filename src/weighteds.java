import java.util.HashMap;
import java.util.*;
import java.util.HashSet;

public class weighteds {
    static int subsstring(String p, String q, int k, int n)
    {
        HashSet<String> S = new HashSet<String>();
        for (int i = 0; i<n;i++)
        {
            int sum = 0;
            String s = " ";
        for(int j=i; j<n; ++j)
        {
            int pos = p.charAt(j) - 'a';

            sum += q.charAt(pos) -'0';
            s += p.charAt(j);

            if(sum <= k)
            {
                S.add(s);

            }
            else{
                break;
            }
        }
        }
        return S.size();
    }

    public static void main(String[] args) {
        String p = "abcde";
        String q = "12345678912345678912345678";
        int k = 5;
        int n = p.length();

        System.out.println(subsstring(p,q,k,n));


    }

}
