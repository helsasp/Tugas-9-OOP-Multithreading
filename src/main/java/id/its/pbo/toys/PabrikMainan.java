package id.its.pbo.toys;

import java.util.List;
import java.util.ArrayList;

public class PabrikMainan {
	
	private List <Thread> daftarMesinThread;
	private List <Mesin> daftarMesin;
	
	public PabrikMainan () {
		daftarMesinThread = new ArrayList <>();
		daftarMesin = new ArrayList <> ();
	}
	public void tambahMesin (Mesin mesin) {
		Thread threadMesin = new Thread(mesin);
		daftarMesinThread.add(threadMesin);
		daftarMesin.add(mesin);
		
	}
	
	public void mulaiProduksi () {
		for(Thread threadMesin : daftarMesinThread) {
			threadMesin.start();
		}
		
		for(Thread threadMesin : daftarMesinThread) {
			try {
				threadMesin.join();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int getJumlahTotalProduksi () {
		int totalProduksi = 0;
		for(Mesin mesin : daftarMesin) {
			totalProduksi += mesin.getJumlahProduksi();
		}
		return totalProduksi;
	}
	
	

}
