package filas;

import java.util.Scanner;

public class Execute {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        FilaInt alunos = new FilaInt();
        int aux, opcao;
        alunos.init();

        System.out.println("(1) Adicionar | (2) Remover | (0) Encerrar");
        opcao = S.nextInt();

    do {
        switch (opcao) {
            case 0:
                if (!alunos.isEmpty())
                    System.out.println("Ainda ha alunos a serem atendidos");
                break;
            case 1:
                if (alunos.isFull())
                    System.out.println("Fila cheia.");
                else {
                    System.out.println("Insira o RM para entrar na fila:");
                    alunos.enqueue(S.nextInt());
                }
                break;
            case 2:
                if (alunos.isEmpty())
                    System.out.println("Fila vazia.");
                else {
                    aux = alunos.dequeue();
                    System.out.println("Aluno retirado: RM" + aux);
                }
                break;
            default:
                System.out.println("Opcao invalida");
        }
        System.out.println("(1) Adicionar | (2) Remover | (0) Encerrar");
        opcao = S.nextInt();
    } while (opcao != 0 && alunos.isEmpty());


    }
}
