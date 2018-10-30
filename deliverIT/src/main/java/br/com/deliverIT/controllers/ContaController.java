package br.com.deliverIT.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.deliverIT.model.Conta;

@RestController
public class ContaController {
	
	private final AtomicLong idGenerator = new AtomicLong();
	
	@RequestMapping("/conta")
	public Conta conta(@RequestParam(value="nome") String nome) {
		return new Conta(idGenerator.incrementAndGet(), nome);
	}
}
