package br.com.deliverIT.controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.deliverIT.model.Conta;
import br.com.deliverIT.repositories.ContaRepository;

@RestController
public class ContaController {
	
	@Autowired
	private ContaRepository contaRepo;
	
	private final AtomicLong idGenerator = new AtomicLong();
	
	@RequestMapping(value = "/conta", method={RequestMethod.POST,RequestMethod.GET})
	public List<Conta> conta(@RequestParam("nome") String nome, 
						@RequestParam("valor") String valor, 
						@RequestParam("dataVencimento") String dataVencimento, 
						@RequestParam("dataPagamento") String dataPagamento) {
		if(nome != null) {
			Conta conta = new Conta(nome, valor, dataVencimento, dataPagamento);
			contaRepo.save(conta);
		}
		return contaRepo.findAll();
	}
}
