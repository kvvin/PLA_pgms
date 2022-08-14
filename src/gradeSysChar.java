import java.util.*;
public class gradeSysChar {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String name; char x;
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter Grade");
        x = sc.next().charAt(0);
        if(x == 'A')
        {
            System.out.println("Marks 90+");
        }
        if(x=='B')
        {
            System.out.println("Marks 80+");
        }
        if(x=='C')
        {
            System.out.println("Marks 60+");
        }
        if(x=='D')
        {
            System.out.println("Marks 50+");
        }
        if(x=='F')
        {
            System.out.println("Marks < 50");
        }



    }
}

