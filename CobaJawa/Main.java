package CobaJawa;

public class Main{
    public static void main(String[] args){
        Mobil kendaraan1 = new Mobil("Golf GTI", "Volkswagen", 12000);
        kendaraan1.infoKendaraan();
        System.out.println();

        Motor kendaraan2 = new Motor("Satria FU", "Suzuki", 9000);
        kendaraan2.infoKendaraan();
        System.out.println();
    }
}