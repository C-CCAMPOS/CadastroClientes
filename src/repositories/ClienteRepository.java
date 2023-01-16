package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	public void exportarDados(Cliente cliente) throws Exception {
		
		PrintWriter printWriter = new PrintWriter("c:\\temp\\clientefinal.txt");
		
		printWriter.write("\nID: " + cliente.getIdCliente());
		printWriter.write("\nNome: " + cliente.getNome());
		printWriter.write("\nEmail: " + cliente.getEmail());
		printWriter.write("\nCPF: " + cliente.getCpf());
		printWriter.write("\nTelefone: " + cliente.getTelefone());
		
		printWriter.flush();
		printWriter.close();
		
		
	}
	
}
