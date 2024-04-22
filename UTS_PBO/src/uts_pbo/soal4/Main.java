
package uts_pbo.soal4;

public class Main {
    public static void main(String[] args) {
        
        LimasSegi4 limas1 = new LimasSegi4(1.0, 1.0, 1.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas1.luasAlas + 
                           ", luas selubung limas : " + limas1.luasSelubungLimas + 
                           " dan tinggi : " + limas1.tinggi + "\nLuasnya : " + 
                           limas1.getLuas() + ", sedangkan volumenya : " + 
                           String.format("%.2f", limas1.getVolume()));

        LimasSegi4 limas2 = new LimasSegi4(30.0, 40.0, 50.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas2.luasAlas + 
                           ", luas selubung limas : " + limas2.luasSelubungLimas + 
                           " dan tinggi : " + limas2.tinggi + "\nLuasnya : " + 
                           limas2.getLuas() + ", sedangkan volumenya : " + 
                           String.format("%.2f", limas2.getVolume()));

        LimasSegi4 limas3 = new LimasSegi4(25.0, 35.0, 45.0);
        System.out.println( "Limas segi empat dengan luas alas : " + limas3.luasAlas + 
                           ", luas selubung limas : " + limas3.luasSelubungLimas + 
                           " dan tinggi : " + limas3.tinggi + "\nLuasnya : " + 
                           limas3.getLuas() + ",sedangkan volumenya: " + 
                String.format("%.2f", limas3.getVolume()) );
    }
}
 

