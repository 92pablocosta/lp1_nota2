package models.funcionarios;
import models.Pessoa;

public class Funcionario extends Pessoa {

    int idFuncionario;

    public Funcionario(String nome, String cpf, String endereco, String telefone, int idFuncionario) {
        super(nome, cpf, endereco, telefone);
        this.idFuncionario = idFuncionario;
    }




}
