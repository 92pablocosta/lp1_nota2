import models.funcionarios.Funcionario;
import models.eventos.Evento;
import models.participantes.Participante;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Evento inova = new Evento("Uniesp Inova", "Feira da universidade", "29/11/2024", "Uniesp");

        System.out.println("Bem vindo ao Evento " + inova.getNome() + "!");
        System.out.println("Participante ou vai trabalhar no evento?");
        System.out.println("1 - Participante");
        System.out.println("2 - Funcionario");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Informe o CPF do participante (sem espaço ou ponto): ");
                String cpfParticipante = sc.next();



        }

    }
}
