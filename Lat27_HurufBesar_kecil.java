/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat27_hurufbesar_kecil;

/**
 *
 * @author hp5cd
 */
import java.util.Scanner;

public class Lat27_HurufBesar_kecil {
    public static void main(String[] args) {
        // Scanner to capture user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        
        // Convert the sentence to uppercase
        String hurufBesar = kalimat.toUpperCase();
        
        // Convert the sentence to lowercase
        String hurufKecil = kalimat.toLowerCase();
        
        // Display the formatted result
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + hurufBesar);
        System.out.println("Huruf Kecil : " + hurufKecil);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}