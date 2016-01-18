package com.coinomi.core.coins.families;

/**
 * @author John L. Jegutanis
 *
 * This is the classical Bitcoin family that includes Litecoin, Dogecoin, Dash, etc
 */
final public class GroestlFamily implements CoinFamily {
    private final static CoinFamily instance = new GroestlFamily();
    public static synchronized CoinFamily get() {
        return instance;
    }

    @Override
    public String toString() {
        return "groestlcoin";
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj instanceof GroestlFamily && toString().equals(obj.toString());
    }
}
