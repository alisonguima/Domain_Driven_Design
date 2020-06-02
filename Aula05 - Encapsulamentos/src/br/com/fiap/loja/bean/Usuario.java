package br.com.fiap.loja.bean;

public class Usuario {

	/*
	 * Modificadores de acesso:
	 * public -> todos possuem acesso
	 * private -> somente a classe possui acesso
	 * protected -> igual ao default + as classes filhas possuem acesso
	 * default/package (sem modificador) -> somente as classes do mesmo pacote possuem acesso
	 */
	
	private String nome;
	
	private int idade;
	
	private String endereco;
	
	private String telefone;
	
	private String email;
	
	private boolean premium;
	
	//Métodos 
	//Encapsulamento
	public void logar() {
		//logar
		notificar();
	}
	
	public void reclamar(String mensagem) {
		//reclamação
		notificar();
	}
	
	private void notificar() {
		//criar um sms
		//enviar
	}
	
	//Encapsulamento -> proteger os dados
	//Gets e Sets
	// nome do método quando boolean podem ser: isXXXX() ou getXXXX()
	public boolean isPremium() {
		return premium;
	}
	
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	
	public String getNome() {
		return nome; //retorna o valor do atributo
	}
	
	public void setNome(String nome) {
		this.nome = nome; //altera o valor do nome (this para referenciar o atributo)
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

}



