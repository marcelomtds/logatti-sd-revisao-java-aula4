package model;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {

    private static final long serialVersionUID = -6269455197937564531L;

    protected int id;
    protected String nome;
    protected Endereco endereco;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome;
    }
}
