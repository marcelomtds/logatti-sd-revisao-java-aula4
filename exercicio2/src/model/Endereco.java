package model;

import java.io.Serializable;

public class Endereco implements Serializable {

    private static final long serialVersionUID = -6066791093755559028L;

    private int id;
    private String logradouro;
    private String cep;
    private String bairro;
    private String cidade;
    private Estado estado;

    public void setId(int id) {
        this.id = id;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Logradouro: " + logradouro + ", CEP: " + cep + ", Bairro: " + bairro + ", Cidade: " + cidade;
    }
}
