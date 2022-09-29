package br.com.startUp.dto;

public class EnderecoDTO {

    private Integer id;
    private String logradouro;
    private String cidade;
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
