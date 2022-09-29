package br.com.startUp.controller;

import java.util.List;

import br.com.startUp.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.startUp.dto.EnderecoDTO;

@RestController
@RequestMapping("/pessoa")
public class EnderecoController {


    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/consultaEnderecos")
    public List<EnderecoDTO> consultarEnderecos(){
        return enderecoService.consultarEnderecos();
    }

    @PostMapping("/salvarEndereco")
    @ResponseStatus(HttpStatus.CREATED)
    public EnderecoDTO salvarEndereco(@RequestBody EnderecoDTO enderecoDTO){
        return enderecoService.salvarEndereco(enderecoDTO);
    }

    @GetMapping("/consultaIdEnderecos/{idPessoa}")
    public List<EnderecoDTO> consultaIdEndereos(@PathVariable Integer idPessoa){
        return enderecoService.consultaIdEnderecos(idPessoa);
    }

    @PutMapping("/alterarEndereco/{id}")
    public EnderecoDTO alterarEndereco(@PathVariable Integer id, @RequestBody EnderecoDTO enderecoDTO){
        return enderecoService.alterarEndereco(id, enderecoDTO);
    }
    
}
