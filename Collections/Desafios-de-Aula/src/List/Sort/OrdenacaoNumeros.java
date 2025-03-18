package List.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.integerList);
        if (!integerList.isEmpty()) {
            Collections.sort(numerosAscendente);
        }
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.integerList);
        if (!integerList.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
        }
        return numerosAscendente;

    }
}
