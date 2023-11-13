package id.its.pbo.traffic;

public class Kendaraan implements Runnable {
    private String nama;
    private int waktuMelintas;
    private Persimpangan persimpangan;

    public Kendaraan(String nama, int waktuMelintas, Persimpangan persimpangan) {
        this.nama = nama;
        this.waktuMelintas = waktuMelintas;
        this.persimpangan = persimpangan;
    }

    public void melintas() {
        System.out.println(nama + " melintas persimpangan...");
        try {
            Thread.sleep(waktuMelintas);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nama + " telah melintas.");
    }

    @Override
    public void run() {
        persimpangan.melintasiPersimpangan(this);
    }
}
