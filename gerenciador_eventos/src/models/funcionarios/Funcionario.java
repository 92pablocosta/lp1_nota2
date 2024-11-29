package models.funcionarios;
import models.Pessoa;
import enums.Funcao;

public class Funcionario extends Pessoa {

    int idFuncionario;
    private Funcao funcao;

    public Funcionario(String nome, String cpf, String endereco, String telefone, boolean checkin, int idFuncionario, Funcao funcao) {
        super(nome, cpf, endereco, telefone, checkin);
        this.idFuncionario = idFuncionario;
        this.funcao = funcao;
    }

    //set
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }

    //get
    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
    public Funcao getFuncao() {
        return funcao;
    }

}
