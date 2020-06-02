package br.com.fiap.tds.bean;

public class Carro {

	private String modelo;
	
	private int quantidadeLugares;
	
	private float comprimento;
	
	private int quantidadePortas;
	
	private int ano;
	
	private Cor cor;
	
	private String placa;
	
	private float motor = 1;
	
	//Construtor para o carro com todos os atributos
	public Carro(String modelo, int quantidadeLugares, float comprimento,
			int qtdPortas, int ano, Cor cor, String placa, float motor){

		this(modelo, cor, placa); //chama o construtor com (modelo, cor, placa)
		
		this.quantidadeLugares = quantidadeLugares;
		this.quantidadePortas = qtdPortas;
		this.comprimento = comprimento;
		this.motor = motor;
		this.ano = ano;
		//this.cor = cor;
		//this.placa = placa;
		//this.modelo = modelo;
	}
	
	//Construtor
	public Carro(String modelo, Cor cor, String placa) {

		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		
	}
	
	//Construtor padrão
	public Carro() {
		
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}

	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
