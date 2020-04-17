package model;

import java.io.Serializable;

public class Estado implements Serializable {

    private static final long serialVersionUID = -6262948056842912791L;

    private int id;
    private String uf;
    private String descricao;

    public void setId(int id) {
        this.id = id;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", UF: " + uf + ", Descriçao: " + descricao;
    }
}
