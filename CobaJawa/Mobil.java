package CobaJawa;

public class Mobil extends Kendaraan{
    private String jeniscar;
    private int yearbuat;

    public Mobil(String nameVeh, String brand, double harga) {
        super(nameVeh, brand, harga);
        this.jeniscar = jeniscar;
        this.yearbuat = yearbuat;
    }

    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("Jenis Mobil : " + jeniscar);
        System.out.println("Tahun produksi : " + yearbuat);
    }
}
