package com.junior.curso_java_basico.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Faça um programa que peça dois números e imprima o maior deles
		Scanner ler = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		System.out.println("Faca um programa que peca dois numeros e imprima o maior deles");
		System.out.println("Digite um numero");
		numero1 = ler.nextInt();
		System.out.println("Digite outro numero");
		numero2 = ler.nextInt();
		if(numero1 > numero2) {
			System.out.println("O maior numero = "+numero1);
		}if(numero2 == numero1) {
			System.out.println("Os numeros sao iguais");
		}else if (numero2>numero1){
			System.out.println("O maior numero" +numero2);
		}
		
	}

}
