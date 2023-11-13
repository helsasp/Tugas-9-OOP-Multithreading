package id.its.pbo.traffic;

public class SimulasiLaluLintasProgram {
    public static void main(String[] args) {
        Persimpangan persimpangan = new Persimpangan(); // Create Persimpangan instance

        Kendaraan k1 = new Kendaraan("Mobil", 1000, persimpangan);
        Kendaraan k2 = new Kendaraan("Motor", 800, persimpangan);
        Kendaraan k3 = new Kendaraan("Bus", 1200, persimpangan);

        SimulasiLaluLintas simulasi = new SimulasiLaluLintas();

        simulasi.tambahKendaraan(k1);
        simulasi.tambahKendaraan(k2);
        simulasi.tambahKendaraan(k3);

        simulasi.mulaiSimulasi();
    }
}
