package orai0222;

import java.util.Random;

public class Equalizer {

    private static Random rand = new Random();

    public static void main(String[] args) {
        otSor();

    }

    private static void eq() {
        eq(false);
    }

    private static void eq(int db) {
        eq(db, false);
        
    }

    private static void eq(boolean ertek) {
        int db = rand.nextInt(3, 8);
        eq(db, ertek);
    }

    private static void eq(int db, boolean ertek) {
        for (int i = 0; i < db; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.println(" ");

        if (ertek) {
            System.out.print(" " + "(" + db + ")");
        }
    }

    private static void otSor() {
        eq(12);
        eq(8, true);
        eq(true);
        eq(false);
        eq();

    }

}
