/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat28_ganti_kata;

/**
 *
 * @author hp5cd
 */
import java.util.Scanner;

public class Lat28_Ganti_Kata {
    public static void main(String[] args) {
        // Scanner to capture user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        
        // Ask for the word to be replaced
        System.out.print("Ganti Kata: ");
        String kataLama = scanner.nextLine();
        
        // Ask for the new word to replace the old word
        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine();
        
        // Replace all instances of the old word with the new word
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);
        
        // Display the formatted result
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
        
        // Close the scanner
        scanner.close();
    }
}