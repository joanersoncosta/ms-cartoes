package com.github.joanersoncosta.mscliente.cliente.application.api.request;

public record ClienteNovoRequest(
		String cpf, 
		String nome, 
		Integer idade) {
}