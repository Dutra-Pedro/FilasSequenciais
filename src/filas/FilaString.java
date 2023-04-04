package filas;

import java.util.ArrayList;
import java.util.List;

public class FilaString {
    final int N = 3;
    String dados[] = new String[N];
    int ini, fim, cont;

    public void init() {
        ini = fim = cont = 0;
    }

    public boolean isEmpty() {
        if (cont == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (cont == N)
            return true;
        else
            return false;
    }

    public void enqueue(String elem) {
        if (isFull())
            System.out.println("Fila cheia!");
        else {
            dados[fim] = elem;
            fim = (fim + 1) % N;
            cont++;
        }
    }

    public String dequeue() {
        String elem = dados[ini];
        ini = (ini + 1) % N;
        cont--;
        return elem;
    }

    public String first() {
        return dados[ini];
    }
}

