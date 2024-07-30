package com.github.joanersoncosta.mscliente.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import com.github.joanersoncosta.mscliente.cliente.application.api.request.ClienteNovoRequest;
import com.github.joanersoncosta.mscliente.cliente.domain.Cliente;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteRestController implements ClienteAPI {

	@Override
	public Cliente save(ClienteNovoRequest clienteRequest) {
		log.info("[inicia]  ClienteRestController - save  ");
		log.info("[finaliza]  ClienteRestController - save");
		return null;
	}

}