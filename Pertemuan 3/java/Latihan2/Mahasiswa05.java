package Latihan2;

public class Mahasiswa05 {
    
    public String nama, nim, jenisKelamin;
    public double ipk;

    public Mahasiswa05(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public static double hitungRataIPK(Mahasiswa05[] mhs) {
        double totalIPK = 0;
        for (Mahasiswa05 mahasiswa : mhs) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }

    public static Mahasiswa05 mahasiswaTerbaik(Mahasiswa05[] mhs) {
        Mahasiswa05 terbaik = mhs[0];
        for (Mahasiswa05 mahasiswa : mhs) {
            if (mahasiswa.ipk > terbaik.ipk) {
                terbaik = mahasiswa;
            }
        }
        return terbaik;
    }
}


