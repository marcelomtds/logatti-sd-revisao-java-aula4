package model;

public class AnalistaTI extends Funcionario {

    private static final long serialVersionUID = -4481354164687273614L;

    private String tecnologia;

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tecnologia: " + tecnologia;
    }
}
