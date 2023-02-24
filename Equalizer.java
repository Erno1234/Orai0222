
package orai0222;

import java.util.Random;


public class Equalizer {
           private static Random rand = new Random();
    public static void main(String[] args) {
       otSor();
       
    }

    private static void eq(int szam){
        for (int i = 0; i <= szam; i++) {
            System.out.print("\u001B[45m" + " "); 
        }
        System.out.print(" ");
    }
    
    private static void eq(){
       int velsz = rand.nextInt(3,8);
       eq(velsz);
    }
    private static void eq(boolean ertek){
        if (ertek == true){
            eq();
        }
    }
    private static void otSor() {
       eq(12);
       eq(8, true);
       eq();
       eq(false);
       eq();
       
    }
    
}
