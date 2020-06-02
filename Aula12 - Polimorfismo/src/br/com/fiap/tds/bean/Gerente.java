package br.com.fiap.tds.bean;

public class Gerente extends Funcionario {

	//Construtores
	public Gerente() {}

	public Gerente(String nome, String dataNascimento, double salario) {
		super(nome, dataNascimento, salario);
	}

	//Sobrecrita de m�todo
	//O m�todo executado ser� o do objeto (inst�ncia)
	@Override//anota��o que informa que o m�todo � uma sobrescrita
	public void aumentarSalario(double valor) {
		if (salario > 10000) {
			salario += valor/2;
		}else {
			salario += valor;
			//super.aumentarSalario(valor); invoca o m�todo do pai
		}
	}
	
}