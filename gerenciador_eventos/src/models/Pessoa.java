package models;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private boolean checkin;

    public Pessoa(String nome, String cpf, String email, String telefone, boolean checkin) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.checkin = checkin;
    }

    // set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // get
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public boolean isCheckin() {
        return checkin;
    }

    //metodos
    public void fazerCheckin() {
        this.checkin = true;
    }


}
