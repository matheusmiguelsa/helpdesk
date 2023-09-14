package com.matheus.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente extends Pessoa {
    
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(List<Chamado> chamados) {
        this.chamados = chamados;
    }

    public List<Chamado> getChamados() {
        return this.chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }

    public Cliente chamados(List<Chamado> chamados) {
        setChamados(chamados);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(chamados, cliente.chamados);
    }

    @Override
    public String toString() {
        return "{" +
            " chamados='" + getChamados() + "'" +
            "}";
    }
    
}
