package GeoEspac;

public class Cone {
	public double raio;
	public double geratriz;
	public double altura;
	public double areaC;
	public double volumeC;

public double calcAreaC() {
	areaC = Math.PI * (raio*raio)+ Math.PI * (raio*geratriz) ;
	return areaC;}
public double calcVol() {
	volumeC= 1/3* Math.PI * (raio*raio)*altura;
	return volumeC;
}
}
