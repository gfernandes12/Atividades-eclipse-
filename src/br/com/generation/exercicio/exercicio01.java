package br.com.generation.exercicio;

import java.util.Scanner;

public class exercicio01 {
public static void main(String[] args) {
	
	
	
int number;
double resultado;

Scanner input = new Scanner(System.in);

System.out.println("Digite um numero: ");
number = input.nextInt();

input.close();

switch(number%2) {
case 1:
	System.out.println("O numero digitado é impar.");
	
	resultado = Math.pow(number, 2);
	System.out.println("Sua raiz quadrada é: " + resultado);
	
	break;
	
	
case 0:
	
	System.out.println("O numero digitado é par.");
	
	resultado = Math.sqrt(number);
	System.out.println("Sua raiz quadrada é: "+ resultado);
	
	break;
	
	
	default:
		break;
}

}
}
