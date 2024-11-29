package models.eventos;

import models.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String descricao;
    private String data;
    private String local;
    private List<Pessoa> pessoas = new ArrayList<>();


    public Evento(String nome, String descricao, String data, String local) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.local = local;
    }

    // set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    // get
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getData() {
        return data;
    }
    public String getLocal() {
        return local;
    }

    //metodos

    public void exibirInfo() {
        System.out.println("Evento: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("Local: " + local);
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void fazerCheckin(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoa.fazerCheckin();
                System.out.println("Check-in de " + pessoa.getNome() + " REALIZADO com sucesso!");
            }
            else {
                System.out.println("CPF não encontrado.");
            }
        }
    }



}
