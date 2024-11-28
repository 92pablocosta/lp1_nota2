package models.participantes;
import models.Pessoa;

public class Participante extends Pessoa {

    private String tipo_igresso;

    public Participante(String nome, String cpf, String email, String telefone, String tipo_igresso) {
        super(nome, cpf, email, telefone);
        this.tipo_igresso = tipo_igresso;
    }

    //set
    public void setTipo_igresso(String tipo_igresso) {
        this.tipo_igresso = tipo_igresso;
    }

    //get
    public String getTipo_igresso() {
        return tipo_igresso;
    }


}