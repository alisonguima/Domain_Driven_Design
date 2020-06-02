/*Aluno: Alison Guimarães Oliveira da Silva | RM: 84601 
 * 		 Henrique Barboza de Moura          | RM: 85163
 * 		 Lucas Fernando Yoshioka 			| RM: 85382
 * 		 Matheus Saraiva Turmina 			| RM: 82665
 * 		 Sabrina Camargo Ramos              | RM: 84638
 * */

package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.*;

public class Terminal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Cliente cli = new Cliente();
		Motoboy b = new Motoboy("Felipe", 23, "Titan (TDS-2020)");
		Pizzaria pizza = new Pizzaria("Pizzaria FIAP", "(11)1234-5678", "Avenida Lins de Vasconselos 1421");
		int confirmado = 0;
		
		 System.out.println("Digite seu nome: "); 
		 cli.setNome(scan.nextLine());
		 
		 System.out.println("Digite seu endereço: ");
		 cli.setEndereco(scan.nextLine());
		  
		 System.out.println("Digite o sabor da pizza: ");
		 cli.escolherSabor(scan.nextLine());
		 
		 System.out.println("Digite a forma de pagamento: ");
		 cli.formaPagamento(scan.nextLine());
		 
		 System.out.println("Digite seu telefone com DDD para contato : ");
		 cli.setTelefone(scan.nextLine());
		 

		System.out.println("Deseja modificar o pedido? 1 - Sim / 2 - Não");
		int opcao = scan.nextInt();

		while (opcao != 2) {
			System.out.println("Deseja modificar o seu nome? 1 - Sim / 2 - Não");
			opcao = scan.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o seu nome: ");
				cli.setNome(scan.next() + scan.nextLine());

			}
			System.out.println("Deseja modificar o endereço? 1 - Sim / 2 - Não");
			opcao = scan.nextInt();
			if (opcao == 1) {
				System.out.println("Digite o endereço: ");
				cli.setEndereco(scan.next() + scan.nextLine());

			}
			System.out.println("Deseja modificar o sabor da pizza? 1 - Sim / 2 - Não");
			opcao = scan.nextInt();
			if (opcao == 1) {
				System.out.println("Digite o sabor da pizza: ");
				cli.escolherSabor(scan.next() + scan.nextLine());
			}
			System.out.println("Deseja modificar a forma de pagamento? 1 - Sim / 2 - Não");
			opcao = scan.nextInt();
			if (opcao == 1) {
				System.out.println("Digite a forma de pagamento: ");
				cli.formaPagamento(scan.next() + scan.nextLine());
			}
			System.out.println("Deseja modificar o telefone para contato? 1 - Sim / 2 - Não");
			opcao = scan.nextInt();
			if (opcao == 1) {
				System.out.println("Digite o número do telefone: ");
				cli.setTelefone(scan.next() + scan.nextLine());
			}
			System.out.println("Deseja fazer uma nova modificação? 1 - Sim / 2 - Não");
			opcao = scan.nextInt();
		}
		
		System.out.println("Podemos confirmar seu pedido? 1 - Sim / 2 - Não");
		confirmado = scan.nextInt();

		
		if (pizza.prepararPizza(confirmado) == true) {

			System.out.println("Sr(a) " + cli.getNome() + " seu pedido foi confirmado, a " + pizza.getNome() + " agradece.");
			
			System.out.println(b.entregarPizza("Sua pizza será entregue pelo nosso motoboy!"));

			System.out.println("");
			System.out.println("------------------------DADOS DO MOTOBOY-------------------------------");
			System.out.println("Nome: " + b.getNome());
			System.out.println("Moto: " + b.getMoto());
			System.out.println("Idade: " + b.getIdade());
			System.out.println("------------------------DADOS DA PIZZARIA-------------------------------");
			System.out.println("Nome: " + pizza.getNome());
			System.out.println("Telefone: " + pizza.getTelefone());
			System.out.println("Endereço: " + pizza.getEndereco());
		} else {
			System.out.println("Pedido cancelado!");
		}
		scan.close();
	}
}