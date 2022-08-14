import java.util.HashMap;
import java.util.Scanner;

public class strobogrammatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Enter the number");
        n = sc.nextLine();
        boolean is_Strobogrammatic = true;
            HashMap<Character, Character> map = new HashMap<>();
            map.put('0', '0');
            map.put('1', '1');
            map.put('8', '8');
            map.put('6', '9');
            map.put('9', '6');

            int left = 0;
            int right = n.length() - 1;
            while (left <= right) {
                if (!map.containsKey(n.charAt(right)) || n.charAt(left) != map.get(n.charAt(right)))
                {
                    is_Strobogrammatic = false;
                }
                else {
                    is_Strobogrammatic = true;
                }
                left++;
                right--;
            }
            System.out.println(is_Strobogrammatic);

        }
    }

