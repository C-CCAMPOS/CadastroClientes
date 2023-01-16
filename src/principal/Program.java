package principal;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class Program {

	public static void main(String[] args) {
		
		System.out.print("----------------------------");
		System.out.print("\n****CADASTRO DE CLIENTES****\n");
		System.out.print("----------------------------");
		
		Cliente cliente = new Cliente();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n\nDigite o ID do cliente: ");
		cliente.setIdCliente(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Digite o Nome do cliente: ");
		cliente.setNome(scanner.nextLine());
		
		System.out.print("Digite o Email do cliente: ");
		cliente.setEmail(scanner.nextLine());
		
		System.out.print("Digite o CPF do cliente: ");
		cliente.setCpf(scanner.nextLine());
		
		System.out.print("Digite o Telefone do cliente: ");
		cliente.settelefone(scanner.nextLine());
		
		ClienteRepository clienteRepository = new ClienteRepository();
		
				
		try {
			clienteRepository.exportarDados(cliente);
			System.out.println("\n>>Cadastrado com sucesso!<<");
			
		}
		catch (Exception e){
			System.out.println("\n>>Erro de Cadastro!<<");
			e.printStackTrace();
			
		}
		
		
		
	}
}
