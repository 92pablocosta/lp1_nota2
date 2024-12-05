package models.participantes;

import models.Pessoa;
import enums.TipoIngresso;

public final class Participante extends Pessoa {

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

    // metodos
    @Override
    public String getTipoPessoa() {
        return "Participante";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Participante");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Tipo de Ingresso: " + tipoIngresso);
    }


}