package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Boletim;
import br.com.fiap.tds.bean.Disciplina;

public class Exemplo03 {

	public static void main(String[] args) {

		Boletim boletim = new Boletim("Joaozinho", new Disciplina[9]);
		
		Disciplina[] vetor = boletim.getDisciplinas();
		vetor[0] = new Disciplina("Web", 10);
		vetor[1] = new Disciplina("Banco de Dados", 9.5f);
		
		boletim.setDisciplinas(vetor);
		
		System.out.println(boletim.getNome() + " " + boletim.getDisciplinas()[0].getNome()
				+ " " + boletim.getDisciplinas()[0].getNota());
	
		for ( Disciplina item : boletim.getDisciplinas()) {
			if (item != null) {
				System.out.println(item.getNome() + " " + item.getNota());
			}
		}
	}
}
