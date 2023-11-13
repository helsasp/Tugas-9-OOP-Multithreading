package id.its.pbo.toys;

public class PabrikMainanProgram {
	
	public static void main (String [] args) {
		
		PabrikMainan pabrik = new PabrikMainan();
		
		Mesin mesin1 = new Mesin ("Mesin 1", 400, 1);
		Mesin mesin2 = new Mesin ("Mesin 2", 250, 2);
		Mesin mesin3 = new Mesin ("Mesin 3", 123, 5);
		
		pabrik.tambahMesin(mesin1);
		pabrik.tambahMesin(mesin2);
		pabrik.tambahMesin(mesin3);
		
		pabrik.mulaiProduksi();
		
		int totalProduksi = pabrik.getJumlahTotalProduksi();
		
		System.out.println("Total mainan yang diproduksi: " + totalProduksi);
	}

}
