
public class TezinaVolumetrijska {

	public static void main(String[] args) {
		
		DimenzijeZapis dim=getDimenzijeZapis();
		
		
		System.out.println("Cjena je u KM :"+tezinaZaCijenu(dim));
		

	}
	
	private static DimenzijeZapis getDimenzijeZapis(){
		DimenzijeZapis dim=new DimenzijeZapis();
		System.out.println("Unesite duzinu paketa u cm");
		dim.length=TextIO.getDouble();
		System.out.println("Unesite visinu paketa u cm");
		dim.height=TextIO.getDouble();
		System.out.println("Unesite sirinu paketa u cm");
		dim.with=TextIO.getDouble();
		System.out.println("Unesite tezinu paketa u kg");
		dim.weight=TextIO.getDouble();
	
		return dim;
	}
	public static double tezinaZaCijenu(DimenzijeZapis dim) {
		double volTezina =izracunVolumetrijskeTezine(dim);
		double odgovarajucaTezina=Math.max(volTezina, dim.weight);
				
		return odgovarajucaTezina*3;
	}

	public static double izracunVolumetrijskeTezine(DimenzijeZapis dim) {
		double volumetrijskaTezina=dim.with*dim.length*dim.height/5000;
		return volumetrijskaTezina;
	}	

}


