/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat21_program_ratarata_nilai;

/**
 *
 * @author hp5cd
 */
import java.util.Scanner;

public class Lat21_Program_RataRata_Nilai {
    
    public static void main(String[] args) {
        // Meminta pengguna memasukkan jumlah mahasiswa
        try (Scanner input = new Scanner(System.in)) {
            // Meminta pengguna memasukkan jumlah mahasiswa
            System.out.print("Masukkan Banyaknya Mahasiswa: ");
            int jumlahMahasiswa = input.nextInt();
            
            // Deklarasi variabel untuk menyimpan total nilai
            double totalNilai = 0;
            
            // Loop untuk menginput nilai setiap mahasiswa
            for (int i = 1; i <= jumlahMahasiswa; i++) {
                System.out.print("Nilai Mahasiswa ke-" + i + ": ");
                double nilai = input.nextDouble();
                totalNilai += nilai;  // Menambahkan nilai ke total nilai
            }
            
            // Menghitung rata-rata nilai
            double rataRata = totalNilai / jumlahMahasiswa;
            
            // Menampilkan hasil rata-rata
            System.out.printf("Rata-rata nilai dari %d mahasiswa adalah: %.2f%n", jumlahMahasiswa, rataRata);
        }
    }
}