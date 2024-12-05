import java.util.Scanner;

import models.Pessoa;
import models.funcionarios.Funcionario;
import models.eventos.Evento;
import models.participantes.Participante;
import enums.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        Evento evento = new Evento("Uniesp Inova", "Feira de tecnologia", "29/11/2024", "Uniesp");

        Participante p1 = new Participante("Pablo", "12345678910", "pablo@123.com", "9911112222", false, TipoIngresso.VIP);
        Funcionario f1 = new Funcionario("João", "09876543211", "Rua tal, 2", "99113322", true, Funcao.COORDENADOR);

        evento.adicionarPessoa(p1);
        evento.adicionarPessoa(f1);

        System.out.println("Bem vindo ao Evento " + evento.getNome());
        System.out.println("Informe o CPF da pessoa: ");
        String buscaCpf = sc.nextLine();

        evento.buscarPorCpf(buscaCpf);
        boolean cpfEncontrado = evento.buscarPorCpf(buscaCpf);
        if (cpfEncontrado) {
            System.out.println("Gostaria de fazer o check-in? [s/n]:");
            String fazerCheckIn = sc.nextLine();

            if (fazerCheckIn.equals("s")) {
                evento.fazerCheckin(buscaCpf);
            }
        }




    }
}
