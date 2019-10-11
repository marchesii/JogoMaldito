package model;

import java.util.Random;

public class Jogo {
	
	public static String disputa(Coisa coisahumano){
		String result = "";
		Coisa coisacomputer = null;
		
		Random randomico = new Random();
		int i = randomico.nextInt(3+1);	
		switch(i){
		case 1: 
			coisacomputer = new Pedra();
			break;
		case 2:
			coisacomputer = new Papel();
			break;
		case 3:
			coisacomputer = new Tesoura();
			break;
		}
		/*
		 * Como não tratou o default, está sorteando um valor a mais e alguns testes implicam em erro de objeto nulo.
		 */
		if(coisacomputer.ganha(coisahumano)){
			result = coisacomputer.toString() + " " + coisacomputer.getAtributo() + " " + coisahumano.toString() + ": " + coisacomputer.toString();
		}else{
			if(coisahumano.ganha(coisacomputer)){
				result = coisahumano.toString() + " " + coisahumano.getAtributo() + " " + coisacomputer.toString() + ": " + coisacomputer.toString();
			}else{
				result = "Ninguem";
			}
		}
		
		result = coisahumano.toString() + " vs " + coisacomputer.toString() + " Resultado: " + result + " ganha.";
		return result;
	}
}
