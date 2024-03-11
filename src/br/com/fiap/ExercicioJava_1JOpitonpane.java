package br.com.fiap;

import javax.swing.JOptionPane;

public class ExercicioJava_1JOpitonpane {
 
	public static void main(String[] args) {
		
		try {
			double prova1, prova2, prova3, prova4 = 0;
			String aux;
			aux = JOptionPane.showInputDialog("Digite sua primeira nota: ");
			prova1 = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite sua segunda nota: ");
			prova2 = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite sua terceira nota: ");
			prova3 = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite sua quarta nota: ");
			prova4 = Double.parseDouble(aux);
			  JOptionPane.showMessageDialog(null, "Valor 1: " + prova1 + "\nValor 2: " + prova2 + "\nValor 3: " + prova3 + "\nValor 4: " + prova4);
			  double media = (prova1 + prova2 + prova3 + prova4) / 4;
			  JOptionPane.showMessageDialog(null, "A média aritmética simples é: " + media);
			  
		} catch (Exception e) {
		  JOptionPane.showMessageDialog(null, "Formato de número icorreto.");		}
	}
}
