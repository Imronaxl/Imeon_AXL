import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[k + 1];
        for (int i = 1; i <= n; i++)a[i] = scanner.nextInt();
        for (int i = 1; i <= k; i++)b[i] = scanner.nextInt();
        for (int i = 1; i <= k; i++) {
            int l = 1, r = n + 1;
            while (l + 1 < r) {
                int md = (l + r) >> 1;
                if (a[md] <= b[i])l = md;
                else r = md;
            }
            if (a[l] == b[i])System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
