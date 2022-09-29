package com.br.curso.startup.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "tb_endereco")
public class EnderecoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Integer id;
    @Column(name = "logradouro" )
    private String logradouro;
    @Column(name = "cidade")
    private String cidade;
   
    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private PessoaDTO pessoaDTO;

    public EnderecoDTO (){

    }

    public EnderecoDTO(String logradouro, String cidade, PessoaDTO pessoaDTO) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.pessoaDTO = pessoaDTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public PessoaDTO getPessoaDTO() {
        return pessoaDTO;
    }

    public void setPessoaDTO(PessoaDTO pessoaDTO) {
        this.pessoaDTO = pessoaDTO;
    }

    
    
}
