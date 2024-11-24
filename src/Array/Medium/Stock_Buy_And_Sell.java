package Array.Medium;

public class Stock_Buy_And_Sell {

    /*
    Example 1:
    Input:
    prices = [7,1,5,3,6,4]
    Output:
             5
    Explanation:
    Buy on day 2 (price = 1) and
    sell on day 5 (price = 6), profit = 6-1 = 5.

    Note
    : That buying on day 2 and selling on day 1
    is not allowed because you must buy before
    you sell.

    `Example 2:
    Input:
    prices = [7,6,4,3,1]
    Output:
            0
    Explanation:
    In this case, no transactions are
    done and the max profit = 0.

     */
    public static void main(String[] args) {
        System.out.println(stockBuyAndSell(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }


    // first approach
    public static int stockBuyAndSell(int[] arr) {
        int min = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, arr[i]);
        }
        return profit;
    }


    // second approach
    public static int maxProfit(int[] arr) {      // int[]{7, 1, 5, 3, 6, 4}
        int min = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] - min > maxProfit) {
                maxProfit = arr[i] - min;
            }
        }
        return maxProfit;
    }

}
