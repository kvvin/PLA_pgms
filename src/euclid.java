public class euclid {

        public static int euclid (int x,int y)
        {
            if (x==0||y==0)
            {           return 1;
            }

            if (x<y) {
                int t = x;
                x = y;
                y = t;
            }
            if(x%y==0)
            {
                return y;
            }
            else
            {
                return euclid(y,x%y);
            }
            }

    public static void main(String[] args) {
        int x =10, y =100, g;
        g = euclid(x, y);
        System.out.println("GCD(" + x +  " , " + y+ ") = " + g);
        x = 35; y = 10;
        g = euclid(x, y);
        System.out.println("GCD(" + x +  " , " + y+ ") = " + g);

        x = 31; y = 2;
        g = euclid(x, y);
        System.out.println("GCD(" + x +  " , " + y+ ") = " + g);

    }
}
