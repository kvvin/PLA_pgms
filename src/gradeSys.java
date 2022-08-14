import java.util.*;
public class gradeSys {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String name; int x,y;
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter Marks");
        x = sc.nextInt();
        if(x>=90) {
            System.out.println("Grade A");
        }
        else if(x>=80)
        {
            System.out.println("Grade B");
        }
        else if(x>=60)
        {
            System.out.println("Grade C");
        }
        else if(x>=50)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Fail");
        }



    }
}
