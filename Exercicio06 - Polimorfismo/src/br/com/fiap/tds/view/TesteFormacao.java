package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Bacharelado;
import br.com.fiap.tds.bean.Medio;
import br.com.fiap.tds.bean.Tecnologo;

public class TesteFormacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Ler o tipo de forma��o
		System.out.println("Digite o tipo de forma��o:");
		String tipo = leitor.next();
		
		//Ler a descri��o e o per�odo
		System.out.println("Digite a descri��o:");
		String descricao = leitor.next();
		
		System.out.println("Digite o per�odo");
		int periodo = leitor.nextInt();
		
		//Validar o tipo de forma��o
		if (tipo.equalsIgnoreCase("medio")) {
			
			System.out.println("Digite o tipo de ensino m�dio:");
			String tipoMedio = leitor.next();
			
			Medio medio = new Medio(descricao, periodo, tipoMedio);
			System.out.println(medio);
			
		} else if (tipo.equalsIgnoreCase("tecnologo")) {
			
			System.out.println("Digite plano estendido:");
			boolean plano = leitor.nextBoolean();
			
			Tecnologo tecnologo = new Tecnologo(descricao, periodo, plano);
			System.out.println(tecnologo);
			
		} else if (tipo.equalsIgnoreCase("bacharelado")){
			
			System.out.println("Digite o projeto:");
			String projeto = leitor.next();
			System.out.println("Carga hor�ria do est�gio:");
			int cargaHoraria = leitor.nextInt();
			
			Bacharelado bacharelado = new Bacharelado(null, periodo,
					projeto, cargaHoraria);
			System.out.println(bacharelado);
			
		} else {
			
			System.out.println("Forma��o inv�lida");
		
		}
		
		//Fechar os recursos
		leitor.close();
	}
	
}
