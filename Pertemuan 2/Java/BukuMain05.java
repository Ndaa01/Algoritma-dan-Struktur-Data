package Java;
public class BukuMain05 {
        public static void main(String[] args) {
            Buku05 bk1 = new Buku05();
            bk1.judul = "Today Ends Tomorrow Comes";
            bk1.pengarang = "Denanda Pratiwi";
            bk1.halaman = 198;
            bk1.stok = 13;
            bk1.harga = 71000;
    
            bk1.tampilInformasi();
            bk1.terjual(5);
            bk1.gantiHarga(60000);
            bk1.tampilInformasi();

            Buku05 bk2 = new Buku05("Self Reward", "Maheera Ayesha", 160, 29, 59000);
            bk2.terjual(11);
            bk2.tampilInformasi();

            Buku05 bk3 = new Buku05("Struktur Data", "Nanda", 154, 14, 88999);
            bk3.terjual(7);
            bk3.tampilInformasi();
            System.out.println("Total Harga: " + bk3.hitungHargaTotal());
            System.out.println("Diskon: " + bk3.hitungDiskon());
            System.out.println("Total Bayar: " + bk3.hitungHargaBayar());
        }
    }
