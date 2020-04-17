package model;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {

    private static final long serialVersionUID = -6366802013834398236L;

    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString() + ", Limite: " + limite;
    }
}
