package Latihan1;

import java.util.Scanner;

public class ArrayOfObject05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kerucut: ");
        int jumlahKerucut = sc.nextInt();
        Kerucut05[] kerucutArray = new Kerucut05[jumlahKerucut];

        System.out.print("Masukkan jumlah limas segi empat: ");
        int jumlahLimasSegiEmpat = sc.nextInt();
        LimasSegiEmpat05[] limasSegiEmpatArray = new LimasSegiEmpat05[jumlahLimasSegiEmpat];

        System.out.print("Masukkan jumlah bola: ");
        int jumlahBola = sc.nextInt();
        Bola05[] bolaArray = new Bola05[jumlahBola];

        // Input atribut untuk setiap kerucut
        for (int i = 0; i < jumlahKerucut; i++) {
            System.out.println("Atribut kerucut ke-" + (i + 1));
            System.out.print("Masukkan Jari-Jari: ");
            int jariJari = sc.nextInt();
            System.out.print("Masukkan Sisi Miring: ");
            int sisiMiring = sc.nextInt();
            kerucutArray[i] = new Kerucut05(jariJari, sisiMiring);
            System.out.println();
        }

        // Input atribut untuk setiap limas segi empat
        for (int i = 0; i < jumlahLimasSegiEmpat; i++) {
            System.out.println("Atribut limas segi empat ke-" + (i + 1));
            System.out.print("Masukkan Panjang Sisi Alas: ");
            int panjangSisiAlas = sc.nextInt();
            System.out.print("Masukkan Tinggi: ");
            int tinggi = sc.nextInt();
            limasSegiEmpatArray[i] = new LimasSegiEmpat05(panjangSisiAlas, tinggi);
            System.out.println();
        }

        // Input atribut untuk setiap bola
        for (int i = 0; i < jumlahBola; i++) {
            System.out.println("Atribut bola ke-" + (i + 1));
            System.out.print("Masukkan Jari-Jari: ");
            int jariJariBola = sc.nextInt();
            bolaArray[i] = new Bola05(jariJariBola);
            System.out.println();
        }

        // Output untuk setiap kerucut
        System.out.println("\nHasil Perhitungan Kerucut:");
        for (int i = 0; i < jumlahKerucut; i++) {
            System.out.println("Luas kerucut ke-" + (i + 1) + ": " + kerucutArray[i].hitungLuas());
            System.out.println("Volume kerucut ke-" + (i + 1) + ": " + kerucutArray[i].hitungVolume());
            System.out.println();
        }

        // Output untuk setiap limas segi empat
        System.out.println("\nHasil Perhitungan Limas Segi Empat:");
        for (int i = 0; i < jumlahLimasSegiEmpat; i++) {
            System.out.println(
                    "Luas limas segi empat ke-" + (i + 1) + ": " + limasSegiEmpatArray[i].hitungLuasPermukaan());
            System.out.println("Volume limas segi empat ke-" + (i + 1) + ": " + limasSegiEmpatArray[i].hitungVolume());
            System.out.println();
        }

        // Output untuk setiap bola
        System.out.println("\nHasil Perhitungan Bola:");
        for (int i = 0; i < jumlahBola; i++) {
            System.out.println("Luas bola ke-" + (i + 1) + ": " + bolaArray[i].hitungLuasPermukaan());
            System.out.println("Volume bola ke-" + (i + 1) + ": " + bolaArray[i].hitungVolume());
            System.out.println();
        }
    }
}
