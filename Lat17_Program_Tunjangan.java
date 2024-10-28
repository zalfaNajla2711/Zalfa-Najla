/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat.pkg17_program_tunjangan;

/**
 *
 * @author hp5cd
 */
import java.util.Scanner;

public class Lat17_Program_Tunjangan {

    // Fungsi untuk menghitung tunjangan
    public static double hitungTunjangan(double gajiPokok, String statusMenikah) {
        if (statusMenikah.equalsIgnoreCase("Menikah")) {
            return 0.35 * gajiPokok;
        } else {
            return 0;
        }
    }

    // Fungsi utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan gaji pokok Anda: Rp ");
        double gajiPokok = input.nextDouble();
        input.nextLine();  // Mengonsumsi newline

        System.out.print("Apakah Anda sudah menikah? (Menikah/Belum): ");
        String statusMenikah = input.nextLine();

        // Menghitung tunjangan dan total gaji
        double tunjangan = hitungTunjangan(gajiPokok, statusMenikah);
        double totalGaji = gajiPokok + tunjangan;

        // Menampilkan hasil
        System.out.printf("Tunjangan Anda: Rp %.2f%n", tunjangan);
        System.out.printf("Total gaji Anda: Rp %.2f%n", totalGaji);

        input.close();
    }
}
