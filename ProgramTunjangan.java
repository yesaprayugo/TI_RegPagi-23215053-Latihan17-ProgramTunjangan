/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.util.Scanner;

public class ProgramTunjangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========Program Tunjangan============");
        
        // Meminta input gaji pokok
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();

        // Meminta input status pernikahan
        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = scanner.next();

        // Menghitung tunjangan
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }

        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Menampilkan hasil perhitungan
        System.out.println("===========Hasil Perhitungan Gaji Anda============");
        System.out.println("Gaji Pokok      : Rp " + gajiPokok);
        System.out.println("Tunjangan       : Rp " + tunjangan);
        System.out.println("Total Gaji      : Rp " + totalGaji);
        System.out.println("(Developed by : Nama Anda)");
        
        scanner.close();
    }
}

