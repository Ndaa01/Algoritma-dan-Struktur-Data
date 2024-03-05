public class Segitiga05 {
    public int alas;
    public int tinggi;

    public Segitiga05(int a, int t) {
    
        this.alas = a;
        this.tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    public double hitungKeliling() {
        return this.alas+this.tinggi+Math.sqrt(Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2));
    }
}
