/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lat26_waktu_saat_ini;

/**
 *
 * @author hp5cd
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lat26_Waktu_Saat_Ini {
    public static void main(String[] args) {
        // Create a formatter with the desired date-time pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));
        
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        
        // Format the current date and time
        String formattedDateTime = now.format(formatter);
        
        // Display the formatted date and time
        System.out.println("Hari ini adalah hari : " + formattedDateTime);
    }
}