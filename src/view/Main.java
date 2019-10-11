package view;

import javax.swing.JOptionPane;

import model.Coisa;
import model.Jogo;
import model.Papel;
import model.Pedra;
import model.Tesoura;


public class Main {
	
	public static void main(String[] args){
		Coisa jogador = null;
		int escolha = 1;
		
		while(escolha <= 3){
			escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "\nEscolha uma das opcoes abaixo para jogar: " +
														"\n1: Escolher Papel" +
														"\n2: Escolher Pedra" +
														"\n3: Escolher Tesoura" +
														"\nPressione qualquer outro numero para sair!"));
			switch(escolha){
			case 1:
				jogador = new Papel();
				JOptionPane.showMessageDialog(null, Jogo.disputa(jogador));//repete o mesmo código em todos os cases, isso está errado.
				break;
			case 2:
				jogador = new Pedra();
				JOptionPane.showMessageDialog(null, Jogo.disputa(jogador));
				break;
			case 3:
				jogador = new Tesoura();
				JOptionPane.showMessageDialog(null, Jogo.disputa(jogador));
				break;
			}
		}
	}
	/*
	 * Nota 3,5
	 */
}
