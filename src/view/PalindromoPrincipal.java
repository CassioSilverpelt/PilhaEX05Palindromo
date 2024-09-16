package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;

public class PalindromoPrincipal {

	public static void main (String[] args) {
		
		
		String texto = JOptionPane.showInputDialog("Insira um texto para verificar se é palíndromo: ");
		PalindromoController palCon = new PalindromoController();
		palCon.verificaString(texto);
		
	}

}
