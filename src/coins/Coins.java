package coins;

public class Coins {
    public static void main(String[] args) {
        double amount = 1346.23;

        //---------------------
        int amountAsInt = (int) (amount * 100);
        int[] coins = {500, 200, 100, 50, 20, 1};
        int counterCoin = 0;
        int counterAmount = 0;

        while (amountAsInt != 0){
            if(amountAsInt - coins[counterCoin] >= 0){
                amountAsInt -= coins[counterCoin];
                counterAmount++;
            }else{
                counterCoin++;
            }
        }
        System.out.println(counterAmount);
    }
}
