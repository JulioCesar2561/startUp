package com.br.curso.startup.repository;

import com.br.curso.startup.dto.PessoaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaDTO, Integer> {

}
