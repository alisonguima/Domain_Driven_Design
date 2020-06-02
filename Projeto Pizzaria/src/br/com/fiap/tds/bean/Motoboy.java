/*Aluno: Alison Guimarães Oliveira da Silva | RM: 84601 
 * 		 Henrique Barboza de Moura          | RM: 85163
 * 		 Lucas Fernando Yoshioka 			| RM: 85382
 * 		 Matheus Saraiva Turmina 			| RM: 82665
 * 		 Sabrina Camargo Ramos              | RM: 84638
 * */

package br.com.fiap.tds.bean;

public class Motoboy {

	private String nome;
	private int idade;
	private String moto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getMoto() {
		return moto;
	}
	public void setMoto(String moto) {
		this.moto = moto;
	}
	
	public Motoboy(String nome, int idade, String moto) {
		this.nome = nome;
		this.idade = idade;
		this.moto = moto;
	}
	
	public Motoboy() {
		
	}
	
	public String entregarPizza(String statusEntrega) {
		return statusEntrega;
	}
	
}
