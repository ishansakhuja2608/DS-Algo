import java.util.*;

public class Testt {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int nk[] = new int[2];
        for (int i = 0; i < 2; i++) {
            nk[i] = sc.nextInt();

        }
        int n = nk[0];
        int k = nk[1];
        while (n > 0) {
            int x = sc.nextInt();
            if (x % k == 0) {
                count++;
                n--;
            }
        }
        sc.close();
        System.out.println(count);

    }
}