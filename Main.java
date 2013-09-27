package conversor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader leitorEntrada = new InputStreamReader(System.in);
		BufferedReader leitor = new BufferedReader(leitorEntrada);
		
		
		System.out.println("Digite o número da conversão desejada");
		System.out.println("1- Celsius para Fahrenheit");
		System.out.println("2- Celsius para Kelvin");
		System.out.println("3- Fahrenheit para Celsius");
		System.out.println("4- Fahrenheit para Kelvin");
		System.out.println("5- Kelvin para Celsius");
		System.out.println("6- Kelvin para Fahrenheit");
		
		int opcaoLida = Integer.parseInt(leitor.readLine());
		
		System.out.println("Digie o valor que deseja converter");
		
		double valorDigitado = Double.parseDouble(leitor.readLine());
		
		
		Conversor meuConversor = new Conversor();
		
		double resultadoConversao = 0;
		 
		if(opcaoLida == 1){
			resultadoConversao = meuConversor.conversorCelsiusParaFahrenheit(valorDigitado);
			System.out.println(valorDigitado + " graus Celsius são " + resultadoConversao + " graus Fahrenheit.");
			
		}else if(opcaoLida == 2 ){
			resultadoConversao = meuConversor.conversorCelsiusParaKelvin(valorDigitado);
			System.out.println(valorDigitado + " graus Celsius são " + resultadoConversao + " Kelvin.");
		
		}else if(opcaoLida == 3){
			resultadoConversao = meuConversor.conversorFahrenheitParaCelsius(valorDigitado);
			System.out.println(valorDigitado + " graus Fahrenheit são " + resultadoConversao + " graus Celsius.");
			
		}else if(opcaoLida == 4){
			resultadoConversao = meuConversor.conversorFahrenheitParaKelvin(valorDigitado);
			System.out.println(valorDigitado + " graus Fahrenheit são " + resultadoConversao + " Kelvin.");
			
		}else if(opcaoLida == 5){
			resultadoConversao = meuConversor.conversorKelvinParaCelsius(valorDigitado);
			System.out.println(valorDigitado + " Kelvin são " + resultadoConversao + " graus Celsius.");
			
		}else if(opcaoLida == 6){
			resultadoConversao = meuConversor.conversorKelvinParaFahrenheit(valorDigitado);
			System.out.println(valorDigitado + " Kelvin são " + resultadoConversao + " graus Fahrenheit.");
			
		}else {
			System.out.println("Seleção de conversão inválida");
		}
	
	}

}
