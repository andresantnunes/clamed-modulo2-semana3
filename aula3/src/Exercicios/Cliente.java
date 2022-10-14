package Exercicios;

//EX1
public class Cliente {
    String nome;
    Double peso;
    Double altura;
    Integer idade;

//    EX2
    public String IMC(){
        double resultado = peso/(altura*altura);
        if(resultado < 18.5)
            return "Muito Magro";
        else if (resultado > 18.5 && resultado < 24.9)
            return "Normal";
        else if (resultado > 25.0 && resultado < 29.9)
            return "Sobre Peso";
        else if (resultado > 30.0 && resultado < 34.9)
            return "Obeso grau 1";
        else if (resultado > 35.0 && resultado < 39.9)
            return "Obeso grau 2";
        else
            return "Obeso grau 3 ou Móirbido";
    }
}
