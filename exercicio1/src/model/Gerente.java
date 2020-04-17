package model;

public class Gerente extends Funcionario {

    private static final long serialVersionUID = -7526325421137035438L;

    private String setor;

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Setor: " + setor;
    }
}
