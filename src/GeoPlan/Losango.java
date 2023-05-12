package GeoPlan;

public class Losango {
	public double DMaior;
	public double DMenor;
	public double areaL;
	
	public void listaAtributosL() {
		System.out.println("Diagonal maior do losango: "+DMaior);
		System.out.println("Diagonal menor do losango: "+DMenor);
	}
	
	public double calcAreaL() {
		areaL = (DMaior * DMenor)/2;
		return areaL;
	}
}
