package models.funcionarios;

public class Staff extends Funcionario {
    public Staff(String nome, String cpf, int id) {
        super(nome, cpf, id);
    }

    @Override
    public void funcao() {
        System.out.println("Eu sou Staff nesse evento!");
    }
}
