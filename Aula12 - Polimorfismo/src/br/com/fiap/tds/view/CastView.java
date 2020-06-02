package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Gerente;
import br.com.fiap.tds.bean.Pessoa;

public class CastView {

	public static void main(String[] args) {
		//Instanciar um funcion�rio
		Funcionario f = new Funcionario();
		
		//Instanciar um gerente atribuindo em uma vari�vel do tipo pessoa
		Pessoa p = new Gerente();
		
		//Valida se a inst�ncia em p � do tipo gerente
		if (p instanceof Gerente) {
			
			//Cast -> for�a um tipo de objeto ser de outro tipo
			Gerente g = (Gerente) p;
			
			//Aumentar o sal�rio e exibi-lo
			g.aumentarSalario(10000.0);
			System.out.println(g.getSalario());
			
		}else {
			System.out.println("p n�o � uma inst�ncia de gerente");
		}
		
	}
	
}
