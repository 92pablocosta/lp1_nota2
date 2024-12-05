package models.funcionarios;
import models.Pessoa;
import enums.Funcao;
import enums.*;
import service.PessoaInterface;

public class Funcionario extends Pessoa implements PessoaInterface {

    private Funcao funcao;

    public Funcionario(String nome, String cpf, String endereco, String telefone, boolean checkin, Funcao funcao) {
        super(nome, cpf, endereco, telefone, checkin);
        this.funcao = funcao;
    }

    //set
    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    //get
    public Funcao getFuncao() {
        return funcao;
    }

    //metodos
    @Override
    public String getTipoPessoa() {
        return "Funcionario";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Funcionário");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Função: " + funcao);

    }

}
