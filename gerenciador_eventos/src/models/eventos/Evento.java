package models.eventos;

public class Evento {
    String nome;
    String descricao;
    String data;
    String local;


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

 
}
