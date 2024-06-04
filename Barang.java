package TUBES;

public class Barang {
    private String nama; // Atribut dengan akses kelas private
    private int harga;   // Atribut dengan akses kelas private

    // Konstruktor
    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter dengan akses kelas public
    public String getNama() {
        return nama;
    }

    // Getter dengan akses kelas public
    public int getHarga() {
        return harga;
    }

    // Setter dengan akses kelas public
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter dengan akses kelas public
    public void setHarga(int harga) {
        this.harga = harga;
    }
}
