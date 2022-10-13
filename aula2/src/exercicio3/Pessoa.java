package exercicio3;

public class Pessoa {
    private String nome;
    private Integer idade;
    private static Integer contadorPessoas;
    private Endereco endereco;

    static class Endereco {

    }


    public void setNome(String nome) {;
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double soma(Double numero1, Double numero2){
        return numero1+numero2;
    }

    public Double soma(Double numero1, Double numero2, Double numero3){
        return numero1+numero2+numero3;
    }
}
