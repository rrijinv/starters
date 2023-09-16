public class RichestCustomerWealth {
    public static void main(String[] args) {
        int input[][] = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        SolutionRichestCustomerWealth sol=new SolutionRichestCustomerWealth();
        System.out.println(sol.maximumWealth(input));
    }
}

class SolutionRichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int indWealth = calculateEachWealth(accounts[i]);
            if (maxWealth < indWealth) {
                maxWealth = indWealth;
            }
        }
        return maxWealth;
    }

    private int calculateEachWealth(int[] account) {
        int total = 0;
        for (int i = 0; i < account.length; i++) {
            total += account[i];
        }
        return total;
    }
}
