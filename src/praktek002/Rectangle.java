package praktek002;
public class Rectangle {

    public Rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    double panjang;
    double lebar;

    public Rectangle() {
        panjang = 5;
        lebar = 2;
    }
    
    
    
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
