package Testes;

import filas.FilaInt;

import java.util.Scanner;

public class ExecuteFilaInt {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        FilaInt alunos = new FilaInt();
        int aux, opcao;
        alunos.init();
        do {
            System.out.println("(1) Adicionar | (2) Remover | (0) Encerrar");
            opcao = S.nextInt();
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
                        System.out.println("Aluno atendido: RM" + aux);
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0 || !alunos.isEmpty());
        System.out.println("Fechando programa...");
    }
}
