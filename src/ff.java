import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ff {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int min = 0;
        String str[][] = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                str[i][j] = sc.next();

            }
            min++;
            int total = 1;
            boolean checked[][] = new boolean[m][n];
            Queue q1 = new LinkedList();
            Queue q2 = new LinkedList();
            q1.add(X - 1);
            q2.add(Y - 1);
            checked[X - 1][Y - 1] = true;
            int flag = 0;
            while (!q1.isEmpty() && !q2.isEmpty()) {
                int x1 = (int) q1.remove();
                int y1 = (int) q2.remove();
                int x[] = new int[8];
                int y[] = new int[8];
                y[3] = y[0] = y[5] = y1 - 1;
                x[0] = x[1] = x[2] = x1 - 1;
                x[5] = x[6] = x[7] = x1 + 1;
                y[2] = y[4] = y[7] = y1 + 1;
                x[3] = x[4] = x1;
                y[1] = y[6] = y1;
                flag = 0;
                for (i = 0; i == 0 && x[i] == 0 && y[i] < n && !checked[x[i]][y[i]]; ) {
                    if (str[x[i]][y[i]].equals("T")) {
                        q1.add(x[i]);
                        q2.add(y[i]);
                        checked[x[i]][y[i]] = true;
                    } else {
                        checked[x[i]][y[i]] = true;
                    }
                    total++;
                    flag = 1;
                }
            }
            if (flag == 1) {
                min++;
            }
            if (total == m * n) {
                break;
            }
            System.out.println(min);
        }

        }
    }