import java.util.HashMap;
import java.util.Scanner;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide inputs");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(zeroSum(nums));
    }

    public static int zeroSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int[] pSum = new int[nums.length];
        pSum[0] = nums[0];
        if (map.containsKey(pSum[0])) {
            map.put(0, map.get(pSum[0]) + 1);
        } else {
            map.put(pSum[0], 1);
        }
        for (int i = 1; i < nums.length; i++) {
            pSum[i] = pSum[i - 1] + nums[i];
            if (map.containsKey(pSum[i])) {
                map.put(pSum[i], map.get(pSum[i]) + 1);
            } else {
                map.put(pSum[i], 1);
            }
        }
        int count = 0;
        for (int key : map.keySet()) {
            int val = map.get(key);
            if (val > 1) {
                count += val * (val - 1) / 2; // valC2
            }
        }
        return count;
    }
}
