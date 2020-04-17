package main;

import model.*;
import service.PessoaService;

import java.util.Random;

public class Main {

    private static PessoaService pessoaService;
    private static Random random;

    public static void main(String[] args) {
        random = new Random();
        pessoaService = new PessoaService();

        Estado estado = new Estado();
        estado.setId(random.nextInt(100));
        estado.setUf("SP");
        estado.setDescricao("São Paulo");

        Endereco endereco = new Endereco();
        endereco.setId(random.nextInt(100));
        endereco.setLogradouro("Rua José Dias 89");
        endereco.setCep("14985045");
        endereco.setBairro("Jardim das Flores");
        endereco.setCidade("Araraquara");
        endereco.setEstado(estado);

        Gerente gerente = new Gerente();
        gerente.setId(random.nextInt(100));
        gerente.setNome("Jeferson Messias");
        gerente.setEndereco(endereco);
        gerente.setSetor("Recursos Humanos");
        gerente.setSalario(2900.0);
        pessoaService.inserir(gerente);

        Estado estado2 = new Estado();
        estado2.setId(random.nextInt(100));
        estado2.setUf("MG");
        estado2.setDescricao("Minas Gerais");

        Endereco endereco2 = new Endereco();
        endereco2.setId(random.nextInt(100));
        endereco2.setLogradouro("Rua Pinheiros 234");
        endereco2.setCep("185545203");
        endereco2.setBairro("Parque do Sol");
        endereco2.setCidade("Belo Horizonte");
        endereco2.setEstado(estado2);

        AnalistaTI analistaTI = new AnalistaTI();
        analistaTI.setId(random.nextInt(100));
        analistaTI.setNome("Robson Moreira");
        analistaTI.setEndereco(endereco2);
        analistaTI.setTecnologia("Ruby");
        analistaTI.setSalario(8230.0);
        pessoaService.inserir(analistaTI);

        for (Pessoa pessoa : pessoaService.listarTodas()) {
            System.out.println("Dados Pessoais:");
            System.out.println(pessoa.toString());
            System.out.println("Endereço:");
            System.out.println(pessoa.getEndereco().toString());
            System.out.println("Estado:");
            System.out.println(pessoa.getEndereco().getEstado().toString());
            System.out.print("\n");
        }

    }

}
