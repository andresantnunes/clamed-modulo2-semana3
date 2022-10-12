package exercicio3;

import java.util.ArrayList;

public class Clinica {
    List<Cliente> clientes = new ArrayList<>();
    String dono;

    public Clinica(List<Cliente> clientes, String dono) {
        this.clientes = clientes;
        this.dono = dono;
    }
}
