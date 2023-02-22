
package orai0222;


public class Orai0222 {


    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();
        String szoveg = String.format("az elso 10 szam osszege: %d", osszeg );
        kiiras(szoveg+"\n");
        
        int a = 5;
        int b = 22;
        int c = 3;
        int d = 6;
        int gyok = a+b+c;
        osszeg = osszead(a, b, c, d); 
        szoveg = String.format("%d + %d + %d + %d = %d\n", a, b,c,d, a + b + c + d);
        kiiras(szoveg);
        szoveg = String.format("%d + %d + %d= %d\n",a,b,c, (Math.sqrt(gyok)));
        kiiras(szoveg);
        
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }

    private static int osszead(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    private static void kiiras(String eredmeny) {
        System.out.println(eredmeny);
    }
    
    
}
