import java.util.*;


public class sup {
    static int tot = 0;
    static void perm(int i, String s)
    {
        if(i==(s.length()-1))
        {
            System.out.println(s+ "\n");
            tot++;
            return;
        }
        char prev = '*';
        for(int j= i; j<s.length();j++)
        {
            char []temp = s.toCharArray();
        if (j > i && temp[i] == temp[j])
            continue;
        if (prev != '*' && prev == s.charAt(j))
        {
            continue;
        }
        temp = swap(temp,i,j);
        prev = s.charAt(j);
            perm(i + 1, String.valueOf(temp));
        }
    }

    static char[] swap(char []arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    static String sortString(String inputString)
    {

        char tArray[] = inputString.toCharArray();
        Arrays.sort(tArray);
        return new String(tArray);
    }

    public static void main(String[] args)
    {
        String s = "bac";

        s = sortString(s);

        perm(0, s);
        System.out.print("Total permutations = " +
                tot +"\n");
    }
}
