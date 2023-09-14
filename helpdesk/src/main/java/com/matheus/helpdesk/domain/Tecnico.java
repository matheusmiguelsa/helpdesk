package com.matheus.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tecnico extends Pessoa {
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
    }

    public Tecnico(List<Chamado> chamados) {
        this.chamados = chamados;
    }

    public List<Chamado> getChamados() {
        return this.chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }

    public Tecnico chamados(List<Chamado> chamados) {
        setChamados(chamados);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tecnico)) {
            return false;
        }
        Tecnico tecnico = (Tecnico) o;
        return Objects.equals(chamados, tecnico.chamados);
    }

    @Override
    public String toString() {
        return "{" +
            " chamados='" + getChamados() + "'" +
            "}";
    }

}
