package br.com.model;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		TaxaDeServicoBrasil tx = new TaxaDeServicoBrasil();
		
		tx.taxa(100);
		
		JOptionPane.showConfirmDialog(null, tx.taxa(100));
		System.out.println("Valor final");
	}

}
