/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat25_ejaannama;

/**
 *
 * @author hp5cd
 */
import java.util.Scanner;

public class Lat25_EjaanNama {
    public static void main(String[] args) {
        // Scanner to get input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for their name
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();
        
        // Print the spelling of the name
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
        
        // Close scanner to prevent resource leak
        scanner.close();
    }
}