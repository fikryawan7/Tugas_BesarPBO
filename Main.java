package TUBES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Pilih jenis barang:");
            System.out.println("1. Barang Biasa");
            System.out.println("2. Barang Promo");
            int choice = scanner.nextInt();

            System.out.print("Masukkan nama barang: ");
            String nama = scanner.next();
            
            System.out.print("Masukkan harga barang: ");
            int harga = scanner.nextInt();

            Barang barang;
            if (choice == 2) {
                System.out.print("Masukkan diskon (dalam format persentase, misal 10 untuk 10%): ");
                double diskonPersen = scanner.nextDouble();
                double diskon = diskonPersen / 100;
                barang = new BarangPromo(nama, harga, diskon);
            } else {
                barang = new Barang(nama, harga);
            }

            System.out.print("Masukkan jumlah barang: ");
            int jumlah = scanner.nextInt();

            Transaksi transaksi = new Transaksi(barang, jumlah);

            int totalHarga;
            if (barang instanceof BarangPromo) {
                BarangPromo barangPromo = (BarangPromo) barang;
                totalHarga = barangPromo.getHargaDiskon() * jumlah;
            } else {
                totalHarga = transaksi.getTotalHarga();
            }

            System.out.println("Total harga: " + totalHarga);

            System.out.print("Apakah Anda ingin melanjutkan transaksi? (yes/no): ");
            String lanjut = scanner.next();

            if (!lanjut.equalsIgnoreCase("yes")) {
                running = false;
            }
        }

        scanner.close();
        System.out.println("Program selesai.");
    }
}
