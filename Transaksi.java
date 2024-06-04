package TUBES;


public class Transaksi {
    private Barang barang; // Atribut dengan akses kelas private
    private int jumlah;     // Atribut dengan akses kelas private

    // Konstruktor
    public Transaksi(Barang barang, int jumlah) {
        this.barang = barang;
        this.jumlah = jumlah;
    }

    // Getter dengan akses kelas public
    public Barang getBarang() {
        return barang;
    }

    // Getter dengan akses kelas public
    public int getJumlah() {
        return jumlah;
    }

    // Setter dengan akses kelas public
    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    // Setter dengan akses kelas public
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Fungsi untuk menghitung total harga dengan akses kelas public
    public int getTotalHarga() {
        return barang.getHarga() * jumlah;
    }
}
