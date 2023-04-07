package exc4;

import filas.FilaInt;

import java.util.Scanner;

public class Exc4 {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();
        boolean terminou;
        String resp = " ";

        do {
            System.out.println("1-inserir | 2-processar");
            int opc = S.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("PID:");
                    int val = S.nextInt();
                    fila.enqueue(val);
                }
                case 2 -> {
                    int pid = fila.dequeue();
                    System.out.println("Processo removido. PID: " + pid);
                    System.out.println("Processo finalizado?");
                    String res = S.next();
                    if (res.equalsIgnoreCase("nao")) {
                        fila.enqueue(pid);
                    }
                }
            }
            if (fila.isEmpty()){
                System.out.println("Deseja continuar?");
                resp = S.next();
            }
        } while (!fila.isEmpty() || resp.equalsIgnoreCase("sim"));
    }
}
