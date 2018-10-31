package br.com.deliverIT.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.deliverIT.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{}
