package br.com.startUp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "cpf", length = 11)
    private String cpf;

    @OneToOne(mappedBy = "pessoa")
    private Profile profile;

    @OneToMany(mappedBy = "pessoa")
    private List<Endereco> enderecos;

    public Pessoa (){

    }

    public Pessoa(String nome, Integer idade, Profile profile, List<Endereco> enderecos, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.profile = profile;
        this.enderecos = enderecos;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
