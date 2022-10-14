public class Main {
    public static void main(String[] args) {
//                       objeto          classe
//        Calculadora calculadora = new Calculadora();
//        Integer resultado = calculadora.somar(1,2);
//        System.out.println(resultado);
//        Double resultado2 = calculadora.somar(10.0,20.0);
//        System.out.println(resultado2);

        //método static não precisam de uma instancia para serem executados
        Integer resultado = Calculadora.somar(1,2);
//        System.out.println(resultado);
        Double resultado2 = Calculadora.somar(10.0,20.0);
//        System.out.println(resultado2);

        Pessoa pessoa = new Pessoa("Andre"); // nome = Andre
        Pessoa pessoa1 = new Pessoa(); // nome = Sila
        Pessoa pessoa2 = new Pessoa(); // nome = Felipe
        Pessoa pessoa3 = new Pessoa();

        System.out.println("Contador de Pessoas "+pessoa1.getContadorPessoa());
        System.out.println("Contador de Pessoas "+pessoa.getEspecie());
        System.out.println("Contador de Pessoas "+pessoa1.getEspecie());

        pessoa2.setEspecie("Homo-sapiens");
        System.out.println("Contador de Pessoas "+pessoa1.getContadorPessoa());
        System.out.println("Contador de Pessoas "+pessoa.getEspecie());
        System.out.println("Contador de Pessoas "+pessoa1.getEspecie());
    }
}
