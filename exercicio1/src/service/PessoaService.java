package service;

import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private static List<Pessoa> pessoas = new ArrayList<>();

    public static List<Pessoa> listarTodas() {
        return pessoas;
    }

    public static void inserir(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

}
