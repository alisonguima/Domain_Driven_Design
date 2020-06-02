package br.com.fiap.tds.bean;

public class Carro {

	//Atributos do carro
	public String modelo;
	
	public String marca;
	
	public int ano;
	
	public float motor;
	
	public double preco;
	
	public boolean automatico;
	
	//M�todos do carro
	//retorno (void-> n�o tem retorno) 
	public void ligar() {
		System.out.println("Carro ligando...");
	}
	
	//m�todo com retorno
	public double calcularIpva() {
		double ipva = 0.04 * preco;
		return ipva;
	}
	
	//m�todo com par�metros
	public void aumentarValor(double valor) {
		preco += valor; //preco = preco + valor;
	}
	
	//m�todo que retorna e recebe valores (desconto em %)
	public double calcularDesconto(double desconto) {
		//calcula o valor com desconto
		double precoDescontado = preco - preco * desconto/100;
		//retorna o valor calculado
		return precoDescontado;
	}
	
}




