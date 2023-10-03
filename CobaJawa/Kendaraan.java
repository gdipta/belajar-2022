package CobaJawa;

public class Kendaraan {
    private String nameVeh;
    private String brand;
    private double harga;

    public Kendaraan(String nameVeh, String brand, double harga){
        this.nameVeh = nameVeh;
        this.brand = brand;
        this.harga = harga;
    }

    public void infoKendaraan(){
        System.out.println("Jenis Kendaraan : " + nameVeh);
        System.out.println("Nama Brand : " + brand);
        System.out.println("Harga Kendaraan : " + harga);
    }
}
