/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package targetsaldocalculator;

/**
 *
 * @author hp5cd
 */
public class TargetSaldoCalculator {

    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 3500000;     // Saldo awal sebesar Rp 3.500.000
        double bungaPerBulan = 8;       // Bunga per bulan dalam persen
        double saldoTarget = 6000000;   // Target saldo sebesar Rp 6.000.000
        int bulan = 0;                  // Variabel untuk menghitung bulan

        System.out.printf("Saldo Awal: Rp %.2f%n", saldoAwal);
        System.out.printf("Bunga/Bulan: %.2f%%%n", bungaPerBulan);
        System.out.printf("Saldo Target: Rp %.2f%n", saldoTarget);

        // Loop untuk menghitung saldo hingga mencapai target
        while (saldoAwal < saldoTarget) {
            bulan++;  // Tambah hitungan bulan setiap iterasi
            double bunga = saldoAwal * (bungaPerBulan / 100); // Menghitung bunga bulan ini
            saldoAwal += bunga; // Tambahkan bunga ke saldo

            // Tampilkan saldo setelah tiap bulan
            System.out.printf("Saldo setelah bulan ke-%d: Rp %.2f%n", bulan, saldoAwal);
        }

        // Tampilkan hasil akhir setelah saldo mencapai target
        System.out.printf("Lama tabungan untuk mencapai target: %d bulan%n", bulan);
        System.out.printf("Saldo Akhir: Rp %.2f%n", saldoAwal);
    }
}