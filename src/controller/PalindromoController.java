package controller;

import model.Pilha;

public class PalindromoController {

	public PalindromoController() {
		super();
	}
	
	Pilha p = new Pilha();
	
	public void verificaString(String texto) {
		int tamanho = texto.length();
		String texto2 = texto;
		String textores = "";
		for (int i = 0; i < tamanho; i++) {
			p.push(texto2.substring(i , i+1));
		}
		for (int i = 0; i < tamanho; i++) {
			try {
				textores = textores + p.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		System.out.println(texto);
		System.out.println(textores);
		if (texto.equals(textores)) {
			System.out.println("O texto inserido é palíndromo.");
		} else {
			System.out.println("O texto inserido não é palíndromo.");
		}
	}
	
	

}
