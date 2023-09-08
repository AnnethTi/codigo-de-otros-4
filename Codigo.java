//package com.generation;

/*
 * Este codigo hace hace lectura de las decisiones de los jugadores
 * Compara si son iguales, en caso de verdadero es un empate y se acaba
 * En caso contrario se ejecuta un switch donde se compara la decision del j1
 * con el valor del j2, y en una variable se guarda el ganador para en un futuro imprimirla
 * */




//se importo el Scanner
import java.util.Scanner;

public class Codigo{


//faltaba el main
public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in); //Faltaba el system.in
		
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();
		
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		// se elimino el 2do Scanner ya que no habia necesidad
		String j2 = s.nextLine();
		
		if(j1.equals(j2)) System.out.println("Empate"); // se cambian los == a equals
		else{
		int g = 2;
		switch(j1) { 
		case "piedra":
			if (j2.equals("tijeras")) { // se cambian los == a equals
				g = 1;
			}
		break; //faltaba el break
		case "papel":
			if (j2.equals("piedra") ) { // se cambian los == a equals
				g = 1;
			break;//faltaba el break
			}
		case "tijeras": //se corrige la palabra
				if (j2.equals("papel")) {
					g = 1;
				}
			break;
			default:
			}
			System.out.println("Gana el jugador " + g);
		}
		
		
		s.close(); // se cierra el Scanner
	}
			
}
	