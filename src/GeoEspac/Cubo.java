package GeoEspac;

public class Cubo {
	public double aresta;
	public double areaCb;
	public double volumeCb;
public double calcAreaC() {
	areaCb = 6* (aresta*aresta);
	return areaCb;}
public double calcVol() {
	volumeCb= aresta*aresta*aresta;
	return volumeCb;
}
}
