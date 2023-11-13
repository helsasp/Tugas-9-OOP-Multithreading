package id.its.pbo.traffic;

import java.util.ArrayList;
import java.util.List;

public class SimulasiLaluLintas {
    private List<Kendaraan> daftarKendaraan;

    public SimulasiLaluLintas() {
        daftarKendaraan = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
    }

    public void mulaiSimulasi() {
        Persimpangan persimpangan = new Persimpangan();
        for (Kendaraan kendaraan : daftarKendaraan) {
            Thread thread = new Thread(kendaraan);
            thread.start();
        }
    }
}
