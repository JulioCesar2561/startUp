package com.br.curso.startup.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.curso.startup.dto.EnderecoDTO;
import com.br.curso.startup.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository eRepository;

    public List<EnderecoDTO> consultarEnderecos() {
        return eRepository.findAll();
    }

    public EnderecoDTO salvarEndereco(EnderecoDTO enderecoDTO) {
        eRepository.save(enderecoDTO);
        return enderecoDTO;
    }

    public List<EnderecoDTO> consultaIdEnderecos(Integer idPessoa) {
        return eRepository.findByIdPessoa(idPessoa);
    }

    public EnderecoDTO alterarEndereco(Integer id, EnderecoDTO enderecoDTO) {
        EnderecoDTO enderecoAtual = new EnderecoDTO();
        enderecoAtual = eRepository.findById(id).get();
        BeanUtils.copyProperties(enderecoDTO, enderecoAtual, "id", "pessoaDTO");
        return eRepository.save(enderecoAtual);
    }

}
