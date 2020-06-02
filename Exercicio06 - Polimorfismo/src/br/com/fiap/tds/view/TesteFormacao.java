package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Bacharelado;
import br.com.fiap.tds.bean.Medio;
import br.com.fiap.tds.bean.Tecnologo;

public class TesteFormacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Ler o tipo de formação
		System.out.println("Digite o tipo de formação:");
		String tipo = leitor.next();
		
		//Ler a descrição e o período
		System.out.println("Digite a descrição:");
		String descricao = leitor.next();
		
		System.out.println("Digite o período");
		int periodo = leitor.nextInt();
		
		//Validar o tipo de formação
		if (tipo.equalsIgnoreCase("medio")) {
			
			System.out.println("Digite o tipo de ensino médio:");
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
			System.out.println("Carga horária do estágio:");
			int cargaHoraria = leitor.nextInt();
			
			Bacharelado bacharelado = new Bacharelado(null, periodo,
					projeto, cargaHoraria);
			System.out.println(bacharelado);
			
		} else {
			
			System.out.println("Formação inválida");
		
		}
		
		//Fechar os recursos
		leitor.close();
	}
	
}
