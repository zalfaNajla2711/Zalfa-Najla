/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat24_perbandingandua_buahnilai;

/**
 *
 * @author hp5cd
 */
import java.util.Scanner;

public class Lat24_PerbandinganDua_BuahNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("========Program Perbandingan Nilai========");

            // Input nilai pertama
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = scanner.nextInt();

            // Input nilai kedua
            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = scanner.nextInt();

            // Menampilkan hasil perbandingan
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil : " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            // Tanya apakah ingin mengulangi aktivitas
            System.out.print("\nUlangi Aktivitas ? (Ya/Tidak) : ");
            scanner.nextLine(); // Clear buffer
            ulangi = scanner.nextLine();

        } while (ulangi.equalsIgnoreCase("Ya"));

        System.out.println("Program selesai.");
        scanner.close();
    }
}