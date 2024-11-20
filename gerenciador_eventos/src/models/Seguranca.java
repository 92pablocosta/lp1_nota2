package models;

public class Seguranca extends Funcionario {
    public Seguranca(String nome, String cpf, int id) {
        super(nome, cpf, id);
    }

    public void funcao() {
        System.out.println("Sou o segurança");
    }
    
}
