package GeoPlan;

public class Retangulo {
	public double altura;
    public double comprimento;
    public double areaR;
    
public void listaAtributosR() {
	System.out.println("Altura do retângulo: "+altura);
	System.out.println("Comprimento do retângulo: "+comprimento);
	
}
	
public double calcAreaR() {
	areaR = altura * comprimento;
	return areaR;
}
}
