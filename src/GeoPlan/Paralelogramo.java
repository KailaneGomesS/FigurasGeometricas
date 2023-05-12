package GeoPlan;

public class Paralelogramo {
	public double base;
	public double altura;
	public double areaP;
	
public void listaAtributosP() {
		System.out.println("Base do paralelogramo: "+base);
		System.out.println("Altura do paralelogramo: "+altura);
	}	
	
	
public double calcAreaP() {
	areaP = base * altura;
	return areaP;
}
}
