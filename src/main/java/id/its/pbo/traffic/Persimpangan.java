package id.its.pbo.traffic;

public class Persimpangan {
    private final Object lock = new Object();

    public void melintasiPersimpangan(Kendaraan kendaraan) {
        synchronized (lock) {
            kendaraan.melintas();
        }
    }
}
