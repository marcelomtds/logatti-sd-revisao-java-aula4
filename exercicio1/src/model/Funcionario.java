package model;

public abstract class Funcionario extends Pessoa {

    private static final long serialVersionUID = 7752295083918478923L;

    protected double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario;
    }
}
