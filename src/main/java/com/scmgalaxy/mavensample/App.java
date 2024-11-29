package com.scmgalaxy.mavensample;

import java.util.Scanner;

/**
 * Aplikasi Java untuk mencetak salam, menerima input pengguna, dan melakukan kalkulasi sederhana.
 */
public class App {

    // Method untuk mencetak pesan selamat datang
    private static void printWelcomeMessage() {
        System.out.println("Selamat datang di Aplikasi Java! Ini adalah aplikasi yang berkembang.");
    }

    // Method untuk meminta input pengguna dan memberikan respons
    private static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.println("Halo, " + name + "! Terima kasih telah menggunakan aplikasi ini.");
    }

    // Method untuk kalkulasi sederhana (misalnya, penjumlahan dua angka)
    private static void performSimpleCalculation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println("Hasil penjumlahan dari " + num1 + " + " + num2 + " adalah: " + sum);
    }

    public static void main(String[] args) {
        // Menampilkan pesan selamat datang
        printWelcomeMessage();

        // Menyapa pengguna dan meminta input nama
        greetUser();

        // Melakukan kalkulasi sederhana
        performSimpleCalculation();
    }
}
