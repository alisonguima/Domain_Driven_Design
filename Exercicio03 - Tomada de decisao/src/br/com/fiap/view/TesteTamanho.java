package br.com.fiap.view;

import javax.swing.JOptionPane;

public class TesteTamanho {

	public static void main(String[] args) {
		
		//Ler o nome a altura e o peso
		String nome1 = JOptionPane.showInputDialog("Digite o nome");
		double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		float peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
		
		//Ler o nome a altura e o peso da outra pessoa
		String nome2 = JOptionPane.showInputDialog("Digite o nome da outra pessoa");
		double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		float peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
		
		//Exibindo os dados inseridos pelo usuário
		System.out.println(nome1 + " Altura: " + altura1 + " Peso: " + peso1);
		System.out.println(nome2 + " Altura: " + altura2 + " Peso: " + peso2);
		
		//Comparar a altura para exibir o nome da pessoa mais alta
		if (altura1 > altura2) {
			JOptionPane.showMessageDialog(null, nome1);
		} else if (altura2 > altura1) {
			JOptionPane.showMessageDialog(null, nome2);
		} else {
			JOptionPane.showMessageDialog(null, "Possuem a mesma altura");
		}
		
		//Comprar o peso para exibir o nome da pessoa mais pesada
		if (peso1 > peso2) {
			JOptionPane.showMessageDialog(null, nome1);
		} else if (peso2 > peso1) {
			JOptionPane.showMessageDialog(null, nome2);
		} else {
			JOptionPane.showMessageDialog(null, "Possuem o mesmo peso");
		}
		
	}
	
}
