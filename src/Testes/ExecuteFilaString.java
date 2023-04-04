package Testes;

import filas.FilaInt;
import filas.FilaString;

import java.util.Scanner;

public class ExecuteFilaString {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        FilaString pacientes = new FilaString();
        int opcao;
        String aux;
        pacientes.init();
        do {
            System.out.println("(1) Adicionar | (2) Remover | (0) Encerrar");
            opcao = S.nextInt();
            if (opcao == 0 && !pacientes.isEmpty()){
                System.out.println("Digite novamente para confirmar:");
                opcao = S.nextInt();
                if (opcao == 0){
                    while (!pacientes.isEmpty()){
                        System.out.println("Encerrando atendimento...");
                        pacientes.dequeue();
                    }
                    break;
                }
            }
            switch (opcao) {
                case 0:
                    if (!pacientes.isEmpty())
                        System.out.println("Ainda ha pacientes a serem atendidos");
                    break;
                case 1:
                    if (pacientes.isFull())
                        System.out.println("Fila cheia.");
                    else {
                        System.out.println("Insira o nome do paciente:");
                        pacientes.enqueue(S.next());
                    }
                    break;
                case 2:
                    if (pacientes.isEmpty())
                        System.out.println("Fila vazia.");
                    else {
                        aux = pacientes.dequeue();
                        System.out.println("Paciente atendido: " + aux);
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0);
        System.out.println("Fechando programa...");
    }
}
