package br.edu.principal;
import GeoPlan.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
	//triangulo
		Triangulo tri = new Triangulo();
		System.out.println("Informe Base: ");
		tri.base =  sc.nextDouble();
		System.out.println("Informe Altura: ");
		tri.altura =  sc.nextDouble();
		
		tri.listaAtributosT();
		
		System.out.print("Área do triângulo: ");	
		double areaT = tri.calcAreaT();
		System.out.println(areaT);
		
		System.out.println(" ");
		
	//quadrado
		
		Quadrado qua = new Quadrado();
		System.out.println("Informe Lado: ");
		qua.lado = sc.nextDouble();
		
		System.out.println("Lado do quadrado: "+qua.lado);
		
		System.out.print("Área do quadrado: ");
		double areaQ = qua.calcAreaQ();
		System.out.println(areaQ);
		
		System.out.println(" ");
		
		//retangulo
		
		Retangulo ret = new Retangulo();
		System.out.println("Informe Base: ");
		ret.altura = sc.nextDouble();
		System.out.println("Informe Base: ");
		ret.comprimento = sc.nextDouble();
		
		ret.listaAtributosR();
		
		System.out.print("Área do retângulo: ");
		double areaR = ret.calcAreaR();
		System.out.println(areaR);
		
		System.out.println(" ");
		
		//circulo
		
		Circulo cir = new Circulo();
		System.out.println("Informe Base: ");
        cir.raio = sc.nextDouble();
		
		System.out.println("Raio do círculo: "+cir.raio);
		
		System.out.print("Área do circulo: ");
		double areaC = cir.calcAreaC();
		System.out.println(areaC);
		
		System.out.println(" ");
		
		//losango
		
		Losango los = new Losango();
		System.out.println("Informe Base: ");
		los.DMaior = sc.nextDouble();
		System.out.println("Informe Base: ");
		los.DMenor = sc.nextDouble();
		
		los.listaAtributosL();
		
		System.out.print("Área do losango: ");
		double areaL = los.calcAreaL();
		System.out.println(areaL);
		
		System.out.println(" ");
		
		//trapezio
		
		Trapezio tra = new Trapezio();
		System.out.println("Informe Base: ");
		tra.altura = sc.nextDouble();
		System.out.println("Informe Base: ");
		tra.BMaior = sc.nextDouble();
		System.out.println("Informe Base: ");
		tra.BMenor = sc.nextDouble();
		
		tra.listaAtributosTP();
		
		System.out.print("Área do trapézio: ");
		double areaTP = tra.calcAreaTP();
		System.out.println(areaTP);
		
        System.out.println(" ");
		
		//paralelogramo
		
		Paralelogramo para = new Paralelogramo();
		System.out.println("Informe Base: ");
		para.altura = sc.nextDouble();
		System.out.println("Informe Base: ");
		para.base = sc.nextDouble();
		
		para.listaAtributosP();
		
		System.out.print("Área do paralelogramo: ");
		double areaP = para.calcAreaP();
		System.out.println(areaP);
		
			
		}		

	}