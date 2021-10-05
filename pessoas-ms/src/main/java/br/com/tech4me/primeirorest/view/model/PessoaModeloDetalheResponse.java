package br.com.tech4me.primeirorest.view.model;

import java.util.List;

import br.com.tech4me.primeirorest.compartilhado.AnimalDto;

public class PessoaModeloDetalheResponse {
    private String id;
    private String nome;
    private String sobrenome;
    private List<AnimalDto> animais;

    //#region Get / Set
    public String getId() {
        return id;
    }

    public List<AnimalDto> getAnimais() {
        return animais;
    }

    public void setAnimais(List<AnimalDto> animais) {
        this.animais = animais;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    //#endregion

    public String getNomeCompleto() {
        return String.format("%s %s", nome, sobrenome);
    }
}
