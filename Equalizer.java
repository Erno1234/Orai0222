
package orai0222;

import java.util.Random;


public class Equalizer {
           private static Random rand = new Random();
    public static void main(String[] args) {
       otSor();
       
    }

    private static void eq(int szam){
        int velsz = rand.nextInt(3,8);
        if (szam > 0){
            for (int i = 0; i <= szam; i++) {
                System.out.print("\u001B[45m" + " "); 
            }
        }else{
            for (int i = 0; i <= velsz; i++) {
                System.out.print("\u001B[45m" + " ");
            }
        System.out.print(" ");
        }
    }

    private static void otSor() {
       eq(12);
       eq();
       eq();
       eq();
       eq();
       
    }
    
}
