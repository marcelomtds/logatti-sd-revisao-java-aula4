package service;

import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private static List<Pessoa> pessoas = new ArrayList<>();

    public List<Pessoa> listarTodas() {
        return pessoas;
    }

    public void inserir(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

}
