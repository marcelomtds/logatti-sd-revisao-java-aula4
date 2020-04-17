package model;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1068407118156372839L;

    protected double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario;
    }
}
