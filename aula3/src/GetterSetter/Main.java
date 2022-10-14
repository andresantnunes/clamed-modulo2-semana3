package GetterSetter;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario1 = new Funcionario("Arthur","81209371",4100.0);
        Funcionario funcionario2 = new Funcionario("Aurelio","81209371");
        Funcionario funcionario3 = new Funcionario(4100.0, "Amaril");
        Funcionario funcionario4 = new Funcionario("Anderson", 4100.0);

        funcionario.adicionaValorNome("Silas");
        if (funcionario.getFuncao() == null){
            funcionario.setFuncao("Estagiário");
        }

        funcionario.setSalario(5312.13);
        funcionario1.setSalario(4554.34);
        funcionario2.setSalario(4124.14);
        funcionario3.setSalario(5342.18);
        funcionario4.setSalario(12314.1);

        System.out.println("Nome Funcionário: "+funcionario.getNome() );
        System.out.println("Nome Funcionário: "+funcionario1.getNome());
        System.out.println("Nome Funcionário: "+funcionario2.getNome());
        System.out.println("Nome Funcionário: "+funcionario3.getNome());
        System.out.println("Nome Funcionário: "+funcionario4.getNome());


        System.out.println("Salario Funcionário: "+funcionario.getSalario() );
        System.out.println("Salario Funcionário: "+funcionario1.getSalario());
        System.out.println("Salario Funcionário: "+funcionario2.getSalario());
        System.out.println("Salario Funcionário: "+funcionario3.getSalario());
        System.out.println("Salario Funcionário: "+funcionario4.getSalario());


        System.out.println("Saldo Funcionário: "+funcionario.getSaldo() );
        System.out.println("Saldo Funcionário: "+funcionario1.getSaldo());
        System.out.println("Saldo Funcionário: "+funcionario2.getSaldo());
        System.out.println("Saldo Funcionário: "+funcionario3.getSaldo());
        System.out.println("Saldo Funcionário: "+funcionario4.getSaldo());

        System.out.println(funcionario);
    }
}
