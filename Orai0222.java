
package orai0222;


public class Orai0222 {


    public static void main(String[] args) {
        kiiras("Eredmény");
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }

    private static int osszead(int a, int b) {
        return a+b;
    }

    private static void kiiras(String eredmeny) {
        System.out.println(eredmeny);
    }
    
    
}
