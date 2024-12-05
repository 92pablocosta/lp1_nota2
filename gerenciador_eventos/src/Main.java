import java.util.Scanner;

import models.funcionarios.Funcionario;
import models.eventos.Evento;
import models.participantes.Participante;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Evento evento = new Evento("Uniesp Inova", "Feira de tecnologia", "29/11/2024", "Uniesp");
        Participante p1 = new Participante("Pablo", "12345678910", "pablo@123.com", "9911112222", false);

        System.out.println("Bem vindo ao Evento " + evento.getNome());
        System.out.println("Digite o CPF do participante: ");
        String cpf = sc.nextLine();



    }
}
