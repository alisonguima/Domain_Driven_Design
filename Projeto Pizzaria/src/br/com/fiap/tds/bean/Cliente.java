/*Alunos: Alison Guimarães Oliveira da Silva | RM: 84601 
 * 		  Henrique Barboza de Moura          | RM: 85163
 * 		  Lucas Fernando Yoshioka 			 | RM: 85382
 * 		  Matheus Saraiva Turmina 			 | RM: 82665
 * 		  Sabrina Camargo Ramos              | RM: 84638
 * */

package br.com.fiap.tds.bean;

public class Cliente {
	//Alterado do Git
	//Alterado do Eclipse
	
	private String nome;
	private String telefone;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Cliente(String nome, String telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Cliente() {
		
	}
	
	public String escolherSabor(String sabor) {
		return sabor;
	}
	
	
	public String formaPagamento(String pagamento) {
		return pagamento;
	}
}
