package main;

import models.Hambali;
import zakat.*;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ZakatApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        boolean running = true;

        System.out.println("\n==============WELCOME TO ZAKAT COUNT APP================");

        System.out.print("Masukkan nama: ");
        Hambali hambali = new Hambali(input.nextLine());

        while (running) {
            System.out.println("\n================= MENU ZAKAT =================");
            System.out.println("1. Zakat Mal");
            System.out.println("2. Zakat Emas");
            System.out.println("3. Zakat Perak");
            System.out.println("4. Zakat Pertanian");
            System.out.println("5. Zakat Perdagangan");
            System.out.println("6. Keluar");
            System.out.println("===============================================");
            System.out.print("Pilih jenis zakat yang ingin dihitung: ");
            int pilihan = input.nextInt();

            Zakat zakat = null; // Polymorphism untuk objek Zakat

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan total harta (zakat mal): Rp.");
                    double totalHarta = input.nextDouble();
                    zakat = new ZakatMal(totalHarta);
                    break;

                case 2:
                    System.out.print("Masukkan total emas (gram): ");
                    double totalEmas = input.nextDouble();
                    zakat = new ZakatEmas(totalEmas);
                    break;

                case 3:
                    System.out.print("Masukkan total perak (gram): ");
                    double totalPerak = input.nextDouble();
                    zakat = new ZakatPerak(totalPerak);
                    break;

                case 4:
                    System.out.print("Masukkan total hasil panen (kg): ");
                    double hasilPanen = input.nextDouble();
                    zakat = new ZakatPertanian(hasilPanen);
                    break;

                case 5:
                    System.out.print("Masukkan total aset dagang: Rp.");
                    double totalAsetDagang = input.nextDouble();
                    zakat = new ZakatPerdagangan(totalAsetDagang);
                    break;

                case 6:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    continue;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    continue;
            }

            // Hitung dan tampilkan zakat
            double hasilZakat = zakat.calculateZakat();
            if (hasilZakat > 0) {
                System.out.println("\nNama: " + hambali.getName());
                System.out.println("Kewajiban zakat: Rp." + df.format(hasilZakat));
            } else {
                System.out.println("Zakat tidak wajib (belum mencapai nishab).");
            }
        }

        input.close();
    }
}
