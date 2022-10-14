package Exercicios;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Alberto";
        cliente.altura = 1.80;
        cliente.peso = 80.0;

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Felipe";
        cliente1.altura = 1.80;
        cliente1.peso = 80.0;

        Clinica clinica = new Clinica();
        clinica.listaClientes.add(cliente);
        clinica.listaClientes.add(cliente1);
        clinica.listaClientes.add(cliente1);

        clinica.categorizaClientes();
    }
}
