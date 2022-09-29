package br.com.startUp.repository;

import br.com.startUp.dto.PessoaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaDTO, Integer> {

}
