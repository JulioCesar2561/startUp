package br.com.startUp.service;

import br.com.startUp.dto.PessoaDTO;
import br.com.startUp.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaDTO> consultar(){
    	return pessoaRepository.findAll();
    }
    
    public PessoaDTO consultarId(Integer id){
        PessoaDTO pessoaSelecionada = new PessoaDTO();
        pessoaSelecionada = pessoaRepository.findById(id).get();
        return pessoaSelecionada;
     }

    public PessoaDTO salvarComRetorno (PessoaDTO pessoaDTO){

        pessoaRepository.save(pessoaDTO);
        return pessoaDTO;
    }

    public String salvar (PessoaDTO pessoaDTO){

        String mensagem;
        pessoaRepository.save(pessoaDTO);
        mensagem = "Salvo com Sucesso";
        return mensagem;
    }

    public void excluir (Integer id){
        pessoaRepository.deleteById(id);
    }

    /* 
    public PessoaDTO salvar(PessoaDTO dto) {
        System.out.println("Acessando a classe Service");
        
        if (dto.getIdade() < 18) {
            System.out.println("Não e possível cadastrar menor de idade.");
            
            Pessoa model = new Pessoa();
            model.setId(dto.getId());
            model.setEmail(dto.getEmail());
            model.setNome(dto.getNome());
            model.setTelefone(dto.getTelefone());
            model.setIdade(dto.getIdade());


            Pessoa pessoaRetornada = pessoaRepository.save(model);
            System.out.println("ID .. :" + pessoaRetornada.getId());
        } else {
            dto.setIdade(dto.getIdade() + 5);
            System.out.println("Cadastro feito com sucesso.");
        }
        
        return dto;
    }
*/

}
