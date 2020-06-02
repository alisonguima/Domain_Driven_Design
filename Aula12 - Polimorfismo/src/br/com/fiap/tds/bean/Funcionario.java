package br.com.fiap.tds.bean;

//final na classe -> n�o permite a heran�a
public class Funcionario extends Pessoa {
	
	//Constante no Java
	//final -> n�o pode alterar o valor
	//static -> pertence a classe e n�o ao objeto
	public static final double AUMENTO_ANUAL = 0.01;
	
	protected double salario;
	
	public Funcionario() {}

	public Funcionario(String nome, String dataNascimento, double salario) {
		super(nome, dataNascimento);
		this.salario = salario;
	}
	
	//M�todo toString para exibir os dados do funcion�rio
	public String toString() {
		return "Nome: " + nome + "\nData Nascimento: " + dataNascimento
				+ "\nSal�rio: " + salario;
	}

	//Polimorfismo -> v�rios comportamentos para o mesmo m�todo
	//Sobrecarga de m�todos
	//Aumentar o sal�rio com o valor absoluto
	public void aumentarSalario(double valor) {
		salario += valor;
	}
	
	//Aumentar o sal�rio em % (10, 20)
	public void aumentarSalario(int porcentagem) {
		this.salario += salario*porcentagem/100;
	}
	
	//Aumentar o sal�rio em comiss�o
	public void aumentarSalario(int qtd, double valor) {
		this.salario += qtd*valor;
	}
	
	//Aumentar o sal�rio padr�o
	public void aumentarSalario() {
		this.salario += salario*AUMENTO_ANUAL;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
