package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
		
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Mirer");
		cliente1.setTelefone("99999999");
		cliente1.setEmail("mirer.rmj@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Balbino");
		cliente2.setTelefone("8888888");
		cliente2.setEmail("mirer.rmj2@gmail.com");
		
		var cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setNome("Andrade");
		cliente3.setTelefone("36291231");
		cliente3.setEmail("mirer.rmj3@gmail.com");
		
		return Arrays.asList(cliente1, cliente2, cliente3);
	}
}
