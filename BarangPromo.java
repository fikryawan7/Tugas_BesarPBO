package TUBES;

public class BarangPromo extends Barang {
    private double diskon; // Atribut dengan akses kelas private

    // Konstruktor
    public BarangPromo(String nama, int harga, double diskon) {
        super(nama, harga);
        this.diskon = diskon;
    }

    // Getter dengan akses kelas public
    public double getDiskon() {
        return diskon;
    }

    // Setter dengan akses kelas public
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    // Fungsi untuk menghitung harga setelah diskon dengan akses kelas public
    public int getHargaDiskon() {
        return (int) (getHarga() * (1 - diskon));
    }
}
