package models.participantes;

import models.Pessoa;
import enums.TipoIngresso;
import service.PessoaInterface;

public final class Participante extends Pessoa implements PessoaInterface {

    private TipoIngresso tipoIngresso;

    public Participante(String nome, String cpf, String email, String telefone, boolean checkin, TipoIngresso tipoIngresso) {
        super(nome, cpf, email, telefone, checkin);
        this.tipoIngresso = null;
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
        System.out.println(getTipoPessoa());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Tipo de Ingresso: " + tipoIngresso);
    }


}