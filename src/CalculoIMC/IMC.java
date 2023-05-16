package CalculoIMC;

public class IMC {
public double altura;
public double peso;
public double result; 
public double calcImc(){
	result= peso/(altura*altura);
	return result;
}

}
