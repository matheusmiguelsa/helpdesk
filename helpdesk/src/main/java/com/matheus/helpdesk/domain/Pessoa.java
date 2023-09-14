package com.matheus.helpdesk.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.matheus.helpdesk.domain.enums.Perfil;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Pessoa {
    
    protected Integer id;
    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    protected Set<Integer> perfis = new HashSet<>();
    protected LocalDate dataCriacao = LocalDate.now();

    public Pessoa(Integer id, String nome, String cpf, String email, String senha, Set<Integer> perfis, LocalDate dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.perfis = perfis;
        this.dataCriacao = dataCriacao;
        addPerfil(Perfil.CLIENTE);

    }

    public Pessoa() {
        super();
        addPerfil(Perfil.CLIENTE);
    }



    public Set<Perfil> getPerfils() {
        return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
    }

    public void addPerfil(Perfil perfil) {
        this.perfis.add(perfil.getCodigo());
    }

}
