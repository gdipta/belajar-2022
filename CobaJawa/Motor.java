package CobaJawa;

public class Motor extends Kendaraan {
    private String jenisbike;
    private int yearbike;

    public Motor(String nameVeh, String brand, double harga){
        super(nameVeh, brand, harga);
        this.jenisbike = jenisbike;
        this.yearbike = yearbike;
    }

    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("Jenis Motor : " + jenisbike);
        System.out.println("Tahun Pembuatan : " + yearbike);
    }
}
