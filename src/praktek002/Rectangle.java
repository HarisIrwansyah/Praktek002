package praktek002;
public class Rectangle {
    double panjang;
    double lebar;
    
    void CetakInfo(){
        System.out.println("###################################");
        System.out.println("Panjang Persegi Panjang : "+panjang);
        System.out.println("Lebar Persegi Panjang   : "+lebar);
        System.out.println("");
    }
    
    double hitungluas(){
        double luas;
        luas = panjang*lebar;
        return luas;
    }
    
    void Cetakluas(){
        System.out.println("Jadi, Luasnya adalah : "+hitungluas());
}
}
