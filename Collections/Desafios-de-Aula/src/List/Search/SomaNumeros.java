package List.Search;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        integerList.add(new Integer(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer i : integerList){
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for(Integer i : integerList){
            if(maior < i) maior = i;
        }
        return maior;
    }
    public int encontrarMenorNumero(){
        int menor = 0;
        for(Integer i : integerList){
            if(menor > i) menor = i;
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(integerList);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "integerList=" + integerList +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        System.out.println(soma);

        soma.adicionarNumero(1);
        soma.adicionarNumero(2);
        soma.adicionarNumero(3);
        soma.adicionarNumero(4);
        soma.adicionarNumero(5);
        System.out.println(soma.calcularSoma());
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.encontrarMenorNumero());
        soma.exibirNumeros();
    }

}
