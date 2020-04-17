package model;

import java.io.Serializable;

public class AnalistaTI extends Funcionario implements Serializable {

    private static final long serialVersionUID = 5354783826230788864L;

    private String tecnologia;

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tecnologia: " + tecnologia;
    }
}
