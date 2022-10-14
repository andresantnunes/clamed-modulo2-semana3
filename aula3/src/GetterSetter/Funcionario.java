package GetterSetter;

public class Funcionario {
    //Atributos
    private String nome;
    private String funcional;
    private Double salario;
    private Double saldo;
    private String funcao;

    //Construtores
    //Construtor vazio ou Default
    Funcionario(){}

    //Construtor com parametros
    public Funcionario(String nome, String funcional, Double salario) {
        this.nome = nome;
        this.funcional = funcional;
        this.salario = salario;
    }

    public Funcionario(String nome, String funcional){
        this.nome = nome;
        this.funcional = funcional;
    }

    public Funcionario(Double salario, String nome) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //Método
// modificador / tipo / nome / parametros
    public String adicionaValorNome(String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    public Double recebeSalario(){
        return this.saldo += this.salario;
    }

    public Double recebeSalario(Double bonus){
        this.saldo = this.saldo + this.salario + bonus;
        return this.saldo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public String getFuncional() {
        return funcional;
    }

//    public void setFuncional(String funcional) {
//        this.funcional = funcional;
//    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getSaldo() {
        return saldo;
    }
//
//    public void setSaldo(Double saldo) {
//        this.saldo = saldo;
//    }


    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
