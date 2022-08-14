public class josephus {
    static int sol(int p, int s)
    {
        if(p==1)
            return 1 ;
        return (sol(p-1,s)+s-1)%p+1;

    }

    public static void main(String[] args) {
        int p =5, s = 2;
        int rel= sol(p,s);
        System.out.println("Safe pos: "+rel);
    }
}
