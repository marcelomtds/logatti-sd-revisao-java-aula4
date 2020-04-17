package main;

import model.AnalistaTI;
import model.Cliente;
import model.Gerente;
import model.Pessoa;
import service.PessoaService;

import java.util.Random;

public class Main {

    public static Random random;

    public static void main(String[] args) {
        random = new Random();

        PessoaService pessoaService = new PessoaService();
        Cliente cliente = new Cliente();
        cliente.setId(random.nextInt(100));
        cliente.setNome("José Francisco Almeida");
        cliente.setTelefone("16997777777");
        cliente.setLimite(89000.0);
        pessoaService.inserir(cliente);

        Gerente gerente = new Gerente();
        gerente.setId(random.nextInt(100));
        gerente.setNome("André Ferreira");
        gerente.setTelefone("11997885555");
        gerente.setSalario(4800.0);
        gerente.setSetor("Financeiro");
        pessoaService.inserir(gerente);

        AnalistaTI analistaTI = new AnalistaTI();
        analistaTI.setId(random.nextInt(100));
        analistaTI.setNome("Eduardo Santos");
        analistaTI.setTelefone("19997885454");
        analistaTI.setSalario(2500.0);
        analistaTI.setTecnologia("Java");
        pessoaService.inserir(analistaTI);

        for (Pessoa pessoa : pessoaService.listarTodas()) {
            System.out.println(pessoa.toString());
        }
    }

}
