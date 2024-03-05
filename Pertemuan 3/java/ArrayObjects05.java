import java.util.Scanner;

public class ArrayObjects05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jumlah Persegi Panjang: ");
        int jml = sc.nextInt();
        PersegiPanjang05[] ppArray = new PersegiPanjang05[jml];
        for (int i = 0; i < jml; i++) {
            ppArray[i] = new PersegiPanjang05();
            System.out.println("Persegi Panjang ke- " + i);
            System.out.print("Masukan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke- " + i);
            System.out.println("Panjang: " +ppArray[i].panjang + ", Lebar: " +ppArray[i].lebar);
        }
    }
}