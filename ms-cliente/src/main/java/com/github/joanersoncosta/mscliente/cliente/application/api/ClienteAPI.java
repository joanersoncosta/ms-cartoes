package com.github.joanersoncosta.mscliente.cliente.application.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.joanersoncosta.mscliente.cliente.application.api.request.ClienteNovoRequest;
import com.github.joanersoncosta.mscliente.cliente.domain.Cliente;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {

	Cliente save(@RequestBody ClienteNovoRequest clienteRequest);

}