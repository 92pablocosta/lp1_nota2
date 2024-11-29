package models.participantes;

import models.Pessoa;
import enums.TipoIngresso;

public class Participante extends Pessoa {

    private TipoIngresso tipoIngresso;

    public Participante(String nome, String cpf, String email, String telefone, boolean checkin) {
        super(nome, cpf, email, telefone, checkin);
    }

    //set
    public void setTipo_igresso(TipoIngresso tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    //get
    public String getTipo_igresso() {
        return tipoIngresso.toString();
    }


}