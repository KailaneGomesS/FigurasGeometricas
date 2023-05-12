package GeoPlan;

public class Triangulo {

	public double base;
	public double altura;
	public double area;
	
	public void listaAtributosT() {
		System.out.println("Base do triângulo: "+base);
		System.out.println("Altura do triângulo: "+altura);
	}
	
	public double calcAreaT() {
		area = (base * altura)/2;
		return area;
	}

}
