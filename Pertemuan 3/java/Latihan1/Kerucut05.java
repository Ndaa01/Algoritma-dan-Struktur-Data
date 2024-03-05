package Latihan1;

public class Kerucut05 {
        double jariJari;
        double sisiMiring;
    
        public Kerucut05(double jariJari, double sisiMiring) {
            this.jariJari = jariJari;
            this.sisiMiring = sisiMiring;
        }
    
        public double hitungLuas() {
            return Math.PI * jariJari * jariJari;
        }
    
        public double hitungVolume() {
            return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
        }
    }
