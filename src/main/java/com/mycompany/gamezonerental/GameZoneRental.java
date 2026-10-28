
package com.mycompany.gamezonerental;

import java.util.Scanner;

public class GameZoneRental {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
String ulang = "Y";

do {
        
            System.out.println("==================================");
            System.out.println("       GAMEZONE RENTAL PS");
            System.out.println("==================================");

            // 1. Nama pelanggan
            System.out.print("Nama Pelanggan : ");
            String nama = input.nextLine();

            // 2. Pilihan PlayStation
            System.out.println("\nPilihan PlayStation:");
            System.out.println("1. PlayStation 4 - Rp8.000/jam");
            System.out.println("2. PlayStation 5 - Rp12.000/jam");
            System.out.print("Pilihan         : ");
            int pilihan = input.nextInt();

            String konsol;
            int harga;

            switch (pilihan) {
                case 1:
                    konsol = "PlayStation 4";
                    harga = 8000;
                    break;
                case 2:
                    konsol = "PlayStation 5";
                    harga = 12000;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
                    input.nextLine();
                    continue;
            }

            // 3. Lama bermain
            System.out.print("Lama Bermain (jam): ");
            int durasi = input.nextInt();

            if (durasi <= 0) {
                System.out.println("Lama bermain harus lebih dari 0 jam!");
                input.nextLine();
                continue;
            }

            int biayaSewa = harga * durasi;
            int diskon = 0;

            if (durasi >= 3) {
                diskon = biayaSewa * 10 / 100;
            }

            // 4. Tambah minuman
            System.out.print("Tambah Minuman (Y/T): ");
            input.nextLine();
            String minuman = input.nextLine();

            int biayaMinuman = 0;

            if (minuman.equalsIgnoreCase("Y")) {
                biayaMinuman = 5000;
            }

            int total = biayaSewa - diskon + biayaMinuman;

            // Cetak struk
            System.out.println("\n==================================");
            System.out.println("          STRUK GAMEZONE");
            System.out.println("==================================");
            System.out.println("Nama Pelanggan : " + nama);
            System.out.println("Pilihan        : " + konsol);
            System.out.println("Lama Bermain   : " + durasi + " jam");
            System.out.println("Biaya Sewa     : Rp" + biayaSewa);
            System.out.println("Diskon         : Rp" + diskon);
            System.out.println("Tambah Minuman : "
                    + (biayaMinuman > 0 ? "Ya" : "Tidak"));
            System.out.println("Biaya Minuman  : Rp" + biayaMinuman);
            System.out.println("----------------------------------");
            System.out.println("Total Bayar    : Rp" + total);
            System.out.println("==================================");

            // Mengulang transaksi
            System.out.print("\nTransaksi Baru? (Y/T): ");
            ulang = input.nextLine();

        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("\nTerima kasih telah menggunakan GameZone!");
        input.close();
    }
}
