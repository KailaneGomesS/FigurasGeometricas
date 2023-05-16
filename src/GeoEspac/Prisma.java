package GeoEspac;
// prisma triangular regular
public class Prisma {
public double alturaPTR;
public double ladoT;
public double areaPTR;
public double volumePTR;
public double CalcAreaPTR() {
	areaPTR = 2*(((ladoT*ladoT)* Math.sqrt(3))/ 4)+3*ladoT*alturaPTR;
	return areaPTR;
}
public double CalcVolPTR() {
	volumePTR = ((ladoT*ladoT)*Math.sqrt(3))/4;
	return volumePTR;
}
}
