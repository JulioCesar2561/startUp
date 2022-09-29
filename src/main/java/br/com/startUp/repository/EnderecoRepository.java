package br.com.startUp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.startUp.dto.EnderecoDTO;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoDTO, Integer> {

    @Query("SELECT e FROM EnderecoDTO e WHERE e.pessoaDTO.id = :idPessoa")
    List<EnderecoDTO> findByIdPessoa(Integer idPessoa);
    
}
