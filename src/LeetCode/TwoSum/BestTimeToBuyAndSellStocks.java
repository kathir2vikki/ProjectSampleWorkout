package LeetCode.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class BestTimeToBuyAndSellStocks {

    public int maxProfit(int[] prices)
    {
      int maxProfit = 0;
      int cheepPrice = prices[0];

      for(int i = 1;i< prices.length; i++)
      {
          if(cheepPrice > prices[i])
          {
              cheepPrice = prices[i];
          }

          if(maxProfit < prices[i] - cheepPrice)
          {
              maxProfit =  prices[i] - cheepPrice;
          }
      }
        return maxProfit;
    }

    public static void main (String[] a)
    {
        BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new BestTimeToBuyAndSellStocks();

        int[] prices = {4,1,5,2,7};

        int profit = bestTimeToBuyAndSellStocks.maxProfit(prices);

        System.out.println("Mac profit ==" + profit);
    }
}

