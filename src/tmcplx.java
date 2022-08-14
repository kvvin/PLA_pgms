public class tmcplx //time complexity
{
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        tmcplx demo = new tmcplx();
        System.out.println(demo.findSum(100));
        System.out.println("Time Taken = " + (System.currentTimeMillis()));

    }

    public int findSum(int n) {

       return n*(n+1)/2;
    }
}

