package models.funcionarios;

public class Coordenador extends Funcionario {

    public Coordenador(String nome, String cpf, int id) {
        super(nome, cpf, id);
    }

    @Override
    public void funcao() {
        System.out.println("Eu sou o Coordenador.");
    }


}
