import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Evento ");
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
