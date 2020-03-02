package csi;

public class Coins {
    public static int minCoin(int[] coins, int amount){
        int coinsNeeded = 0;

        while(amount >= 0){
            // This for loop is assuming coins are in
            // ascending value. If not could use array sort
            // to make sure
            for(int i = coins.length - 1; i >= 0; i--){

                // starts with the largest coin and loops down until
                // it finds the largest coin that will not make
                // the remaining amount negative.
                if((amount - coins[i]) >= 0){
                    amount -= coins[i];
                    coinsNeeded++;
                    break;
                }

                // if none of the coins work, forces the last coin to add
                // this will make the amount negative to break the while
                // loop
                if(i == 0){
                    amount -= coins[0];
                }
            }
            if(amount == 0){
                return coinsNeeded;
            }
        }

        return -1;
    }
}
