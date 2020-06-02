package br.com.fiap.tds.bean;

public class Forca {

	//Atributos
	private String letrasCorretas ="", letrasErradas = "", palavra = "", palavraOculta = "";
	private int qtdVidas;
	private boolean acertou;
	
	//Construtor
	public Forca(String palavra, int qtdVidas) {
		this.palavra = palavra;
		this.qtdVidas = qtdVidas;
	}
	
	//Métodos
	public void validarLetra(String letra) {
		//Valida se existe a letra na palavra
		//valida se encontrou a letra na palavra (se não encontra o retorno é -1)
		if (palavra.indexOf(letra) != -1) {
			acertou = true;
			letrasCorretas += letra; //adiciona mais uma letra correta na variável
		}else {
			acertou = false; 
			qtdVidas--; //decrementa a quantidade de vidas
			letrasErradas += letra; //adiciona mais uma letra errada na variável
		}
	}
	
	public void gerarPalavraOculta() {
		palavraOculta = "";
		//Percorrer todas as posições da palavra
		for (int i=0; i < palavra.length(); i++) {
			//Validar se a letra da posição da palavra está nas letrasCorretas
			if (letrasCorretas.indexOf(palavra.charAt(i)) != -1) 
				//Se estiver, adiciona a letra na palavra oculta
				palavraOculta += palavra.charAt(i);
			else
				//Se não, adiciona o *
				palavraOculta += "*";
		}
	}
	
	//Valida se o jogo deve continuar
	public boolean validarJogada() {
		return qtdVidas > 0 && palavraOculta.contains("*");
	}
	
	//Gets e Sets (Métodos)
	public String getLetrasCorretas() {
		return letrasCorretas;
	}
	public void setLetrasCorretas(String letrasCorretas) {
		this.letrasCorretas = letrasCorretas;
	}
	public String getLetrasErradas() {
		return letrasErradas;
	}
	public void setLetrasErradas(String letrasErradas) {
		this.letrasErradas = letrasErradas;
	}
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String getPalavraOculta() {
		return palavraOculta;
	}
	public void setPalavraOculta(String palavraOculta) {
		this.palavraOculta = palavraOculta;
	}
	public int getQtdVidas() {
		return qtdVidas;
	}
	public void setQtdVidas(int qtdVidas) {
		this.qtdVidas = qtdVidas;
	}
	public boolean isAcertou() {
		return acertou;
	}
	public void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}
	
}
