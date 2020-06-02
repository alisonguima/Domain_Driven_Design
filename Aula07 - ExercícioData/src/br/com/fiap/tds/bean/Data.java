package br.com.fiap.tds.bean;

public class Data {

	//Atributos
	private int dia;
	
	private int mes;
	
	private int ano;

	//Construtor (Padr�o)
	public Data() {

	}
	
	//Construtor que recebe todos os par�metros
	public Data(int dia, int mes, int ano) {
		//setDia(dia);
		this.dia = validarDia(dia);
		this.mes = validarMes(mes);
		this.ano = validarAno(ano);
	}
	
	//M�todo que retorna a data formatada
	//M�todo � chamado quando imprimimos o objeto
	public String toString() {
		return dia + " de " +  retornarMes() + " de " + ano;
	}
	
	public String retornarMes() {
		String nomeMes = "";
		switch(mes) {
		case 1:
			nomeMes = "Janeiro";
			break;
		case 2:
			nomeMes = "Fevereiro";
			break;
		case 3:
			nomeMes = "Mar�o";
			break;
		case 4:
			nomeMes = "Abril";
			break;
		case 5:
			nomeMes = "Maio";
			break;
		case 6:
			nomeMes = "Junho";
			break;
		case 7:
			nomeMes = "Julho";
			break;
		case 8:
			nomeMes = "Agosto";
			break;
		case 9:
			nomeMes = "Setembro";
			break;
		case 10:
			nomeMes = "Outubro";
			break;
		case 11:
			nomeMes = "Novembro";
			break;
		case 12:
			nomeMes = "Dezembro";
		}
		return nomeMes;
	}
	
	public int validarDia(int dia) {
		// (maior) >, (menor) <, (maior ou igual) >=, 
		// (menor ou igual) <=, (igual) ==, (diferente) != 
		// (e) &&, (ou) ||
		if (dia < 1 || dia > 31) {
			return 1;
		}else {
			return dia;
		}
	}
	
	public int validarMes(int mes) {
		if (mes >=1 && mes <=12) {
			return mes;
		}else {
			return 1;
		}
	}
	
	public int validarAno(int ano) {
		if (ano < 0) {
			return 2020;
		}else {
			return ano;
		}
	}
	
	public void setDia(int dia) {
		this.dia = validarDia(dia);
	}
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = validarMes(mes);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = validarAno(ano);
	}
	
	
}




