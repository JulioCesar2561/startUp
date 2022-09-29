package com.br.curso.startup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.curso.startup.dto.PessoaDTO;
import com.br.curso.startup.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String status(){

        return "<!DOCTYPE html>\n" +
                "<html lang=\"pt-br\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Status Servidor \uD83D\uDE1C</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "        <header>\n" +
                "            <h1>Ligadão</h1>\n" +
                "        </header>\n" +
                "        <main>\n" +
                "            <section class=\"Introdução\">\n" +
                "                <p>Programa embarco java, spring initializr, maven, H2 Banco de Dados </p>\n" +
                "            </section>\n" +
                "        </main>\n" +
                "        <footer>\n" +
                "            <p>\n" +
                "                <a href=\"http://localhost:8080/pessoa/consultar\">Clique aqui para ver as pessoas cadastradas</a>\n" +
                "            </p>\n" +
                "        </footer>\n" +
                "</body>\n" +
                "</html>   ";
    }

    @GetMapping(value = "/consultar/{id}")
    public PessoaDTO consultaPorId(@PathVariable Integer id){

        if(id == 0){
            return null;
        }else {
            return pessoaService.consultarId(id);
        }
    }

    @GetMapping("/consultar")
    public List<PessoaDTO> consultar(){
        return pessoaService.consultar();
    }

    @PostMapping("/salvar")
    public String salvar(@RequestBody PessoaDTO pessoaDTO) {
       return pessoaService.salvar(pessoaDTO);
    }

    @PostMapping("/salvarComRetorno")
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaDTO salvarComRetorno(@RequestBody PessoaDTO pessoaDTO) {
        return pessoaService.salvarComRetorno(pessoaDTO);
    }

    @DeleteMapping("/excluir/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Integer id){
        pessoaService.excluir(id);
    }

}
