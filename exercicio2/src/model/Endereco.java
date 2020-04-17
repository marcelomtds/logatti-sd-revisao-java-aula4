package model;

import java.io.Serializable;

public class Endereco implements Serializable {

    private static final long serialVersionUID = -6066791093755559028L;

    private int id;
    private String bairro;
    private Estado estado;

    public void setId(int id) {
        this.id = id;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Bairro: " + bairro;
    }
}
