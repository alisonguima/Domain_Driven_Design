package br.com.empresa.cadastro.view;

import javax.swing.JOptionPane;

import br.com.empresa.cadastro.entidades.Cliente;

public class TesteClienteView {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		String titulo = JOptionPane.showInputDialog("Título");
		
		Cliente cliente = new Cliente(id, nome, titulo);
		
		System.out.println(cliente.exibirNomeFormatado());
	}
	
}
