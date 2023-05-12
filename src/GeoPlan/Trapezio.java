package GeoPlan;

public class Trapezio {
	public double BMaior;
	public double BMenor;
	public double altura;
	public double areaTP;
	
public void listaAtributosTP() {
		System.out.println("Base maior do trapézio: "+BMaior);
		System.out.println("Base menor do trapézio: "+BMenor);
		System.out.println("Altura do trapézio: "+altura);
	}	
	
public double calcAreaTP() {
	areaTP = ((BMaior + BMenor) * altura)/2;
	return areaTP;
}
}
