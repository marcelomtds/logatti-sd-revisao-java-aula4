package model;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {

    private static final long serialVersionUID = -1808602704280065205L;

    protected int id;
    protected String nome;
    protected String telefone;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone;
    }
}
