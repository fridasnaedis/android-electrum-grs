package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;;

import org.bitcoinj.core.Coin;

/**
 * @author John L. Jegutanis
 */
public class SmileyCoinMain extends CoinType {
    private SmileyCoinMain() {
        id = "smileycoin.main";

        addressHeader = 25;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;

        family = BitFamily.get();
        name = "Smileycoin";
        symbol = "SMLY";
        uriScheme = "smileycoin";
        bip44Index = 59;
        unitExponent = 8;
        feePerKb = value(100000000);
        minNonDust = value(1000); // 0.00001 GRS mininput
        softDustLimit = value(10000); // 0.00001 GRS
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("SmileyCoin Signed Message:\n");
    }

    private static SmileyCoinMain instance = new SmileyCoinMain();
    public static synchronized SmileyCoinMain get() {
        return instance;
    }
}
