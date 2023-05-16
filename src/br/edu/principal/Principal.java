package br.edu.principal;
import CalculoIMC.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner (System.in);
			
		
			IMC imc = new IMC();
			System.out.println("Informe peso: ");
			imc.peso =  sc.nextDouble();
			System.out.println("Informe Altura: ");
			imc.altura =  sc.nextDouble();	
			System.out.print("Área do triângulo: ");	
			double resultImc = imc.calcImc();
			System.out.println(resultImc);
			
			System.out.println(" ");



}}
