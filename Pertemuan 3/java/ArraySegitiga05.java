public class ArraySegitiga05 {
    public static void main(String[] args) {
        Segitiga05 [] sgArray = new Segitiga05[4];
        for (int i = 0; i < 4; i++) {
            sgArray[0] = new Segitiga05(10, 4);
            sgArray[1] = new Segitiga05(20, 10);
            sgArray[2] = new Segitiga05(15, 6);
            sgArray[3] = new Segitiga05(25, 10);
        }

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Luas Segitiga ke- " + i + ": " + sgArray[i].hitungLuas() + "\n Keliling Segitiga ke- " + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}
