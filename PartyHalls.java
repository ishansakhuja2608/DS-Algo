import java.util.Arrays;
import java.util.Scanner;

class PartyHalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            e[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Total numbers of Party Halls required are : " + Party.partyHall(s, e));
    }
}

class Party {
    public static int partyHall(int[] s, int[] e) {
        Arrays.sort(s);
        Arrays.sort(e);
        int i = 0, j = 0, count = 0, res = 0;
        while (i < s.length && j < e.length) {
            if (s[i] < e[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            if (res < count)
                res = count;
        }
        return res;
    }
}