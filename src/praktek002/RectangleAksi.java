package praktek002;

public class RectangleAksi {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
            
            r1.panjang = 10;
            r1.lebar = 5;
            
        r1.CetakInfo();
        System.out.println("Luas Persegi Panjang : "+r1.hitungluas());
        r1.Cetakluas();
        
        Rectangle r2 = new Rectangle();
        r2.CetakInfo();
        
        Rectangle r3 = new Rectangle(12,7);
        r3.CetakInfo();
    }
    
}
