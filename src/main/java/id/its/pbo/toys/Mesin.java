package id.its.pbo.toys;

public class Mesin implements Runnable{
	
	private String namaMesin;
	private int waktuProduksi;
	private int targetProduksi;
	private int jumlahProduksi;
	
	public Mesin (String namaMesin, int waktuProduksi, int targetProduksi) {
		this.namaMesin = namaMesin;
		this.waktuProduksi = waktuProduksi;
		this.targetProduksi = targetProduksi;	
		this.jumlahProduksi = 0;
		
		
	}
	
	public void run() {
        while (jumlahProduksi < targetProduksi) {
            try {
                Thread.sleep(waktuProduksi);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            jumlahProduksi++;
            System.out.println(namaMesin + " telah memproduksi " + jumlahProduksi + " mainan.");
        }
    }
	
	public int getJumlahProduksi () {
		return jumlahProduksi;
	}

}
