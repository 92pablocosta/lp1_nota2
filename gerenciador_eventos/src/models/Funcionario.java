package models;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private int id;

    public Funcionario(String nome, String cpf, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    // set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    public void setId(int id) {
        this.id = id;
    }

    // get
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public int getId() {
        return id;
    }

    // metodos
    public abstract void funcao();




}
