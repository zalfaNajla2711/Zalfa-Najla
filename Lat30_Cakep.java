/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat30_cakep;

/**
 *
 * @author hp5cd
 * NAMA: Zalfa Dhia Najla
 * KELAS: PBO12
 * NIM: 23176008
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * Deskripsi Program: Program ini berisi program untuk menampilkan
 * program cakep
 *
 */
import java.util.Scanner;

public class Lat30_Cakep {
    // ANSI escape codes for colors
    public static final String RESET = "\033[0m";  // Reset all attributes
    public static final String RED = "\033[0;31m"; // Red
    public static final String GREEN = "\033[0;32m"; // Green
    public static final String YELLOW = "\033[0;33m"; // Yellow
    public static final String BLUE = "\033[0;34m"; // Blue
    public static final String CYAN = "\033[0;36m"; // Cyan
    public static final String MAGENTA = "\033[0;35m"; // Magenta

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input prompt with color
        System.out.print(CYAN + "Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?\n" + RESET);
        System.out.print(YELLOW + "Jawab (Yoi/Enggak) : " + RESET);
        String jawaban = scanner.nextLine().toLowerCase();
        
        // Output based on user's answer with different colors
        if (jawaban.equals("yoi")) {
            System.out.println(GREEN + "Cakep Bener. Good Job" + RESET);
        } else if (jawaban.equals("enggak")) {
            System.out.println(RED + "Tetep cakep sih." + RESET);
            System.out.println(BLUE + "Sing penting paham konsep nya yee." + RESET);
            System.out.println(MAGENTA + "Keep the code works dude" + RESET);
        } else {
            System.out.println(RED + "Jawaban tidak valid, harus Yoi atau Enggak." + RESET);
        }
    }
}

