public class HouseRobbers {

    static int robber(int houses[], int curr, int n) {

        if (curr >= n) {
            return 0;
        }
        int rob = houses[curr] + robber(houses, curr + 2, n);
        int dont = robber(houses, curr + 1, n);

        return Math.max(rob, dont);
    }

    public static void main(String[] args) {
        int houses[] = { 2, 7, 9, 3, 1 };
        int n = 5;
        System.out.println(robber(houses, 0, n));
    }
}