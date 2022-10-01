package br.com.startUp.model;

import br.com.startUp.dto.PessoaDTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Integer id;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "cidade")
    private String cidade;

//    @ManyToOne
//    @JoinColumn(name = "id_pessoa")
//    private Pessoa pessoa;


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

//    public Pessoa getPessoa() {
//        return pessoa;
//    }
//
//    public void setPessoaDTO(Pessoa pessoa) {
//        this.pessoa = pessoa;
//    }

}

