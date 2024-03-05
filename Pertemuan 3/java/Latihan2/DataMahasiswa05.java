package Latihan2;

import java.util.Scanner;

public class DataMahasiswa05 {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa05[] mhs = new Mahasiswa05[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mhs[i] = new Mahasiswa05(nama, nim, jenisKelamin, ipk);
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("NIM: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jenisKelamin);
            System.out.println("IPK: " + mhs[i].ipk);
        }

        System.out.println();
        double rataIPK = Mahasiswa05.hitungRataIPK(mhs);
        System.out.println("Rata-rata IPK: " + rataIPK);
        System.out.println();

        Mahasiswa05 terbaik = Mahasiswa05.mahasiswaTerbaik(mhs);
        System.out.println("Mahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + terbaik.nama);
        System.out.println("NIM: " + terbaik.nim);
        System.out.println("Jenis Kelamin: " + terbaik.jenisKelamin);
        System.out.println("IPK: " + terbaik.ipk);

    }

}
