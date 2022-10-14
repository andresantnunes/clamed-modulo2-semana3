public class Pessoa {
    private String nome;
    private static int contadorPessoa;
    private static String especie = "humana";

    Pessoa(){
        contadorPessoa++;
    }

    Pessoa (String nome){
        this.nome = nome;
        System.out.println(nome);
    }

    public Integer getContadorPessoa() {
        return contadorPessoa;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        Pessoa.especie = especie;
    }
}
