package Metodos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();;
        System.out.println(calculadora.soma(10.0, 10.0));

        System.out.println(calculadora.divisao(31.0,312.123));
        System.out.println(calculadora.multiplicacao(123.13,9879.0));
        System.out.println(calculadora.subtracao(2319.13,144123145.8));

        calculadora.printHistoricos();

        calculadora.potencia(12d,341d);
    }

    public static void helloWorld(){
        System.out.println("Hello World");
    }
}
