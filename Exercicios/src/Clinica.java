import java.util.ArrayList;
import java.util.List;

//Ex3
public class Clinica {
    private String donoClinica;
    private List<Cliente> listaClientes = new ArrayList<>();

    public Clinica(String donoClinica, List<Cliente> listaClientes) {
        this.donoClinica = donoClinica;
        this.listaClientes = listaClientes;
    }

    public Clinica(String donoClinica) {
        this.donoClinica = donoClinica;
    }

    // EX7
    public Double tratamento(Cliente cliente){
        cliente.setPeso(cliente.getPeso() - 5);
        return cliente.getPeso();
    }

    // EX8
    public Double tratamento(Cliente cliente, Double valorPesoPerdido){
        cliente.setPeso(cliente.getPeso() - valorPesoPerdido);
        return cliente.getPeso();
    }

    public void categorizaClientes(){
        List<Cliente> categoriaMuitoMagro = new ArrayList<>();
        List<Cliente> categoriaNormal = new ArrayList<>();
        List<Cliente> categoriaSobrePeso = new ArrayList<>();
        List<Cliente> categoriaObeso1 = new ArrayList<>();
        List<Cliente> categoriaObeso2 = new ArrayList<>();
        List<Cliente> categoriaObeso3 = new ArrayList<>();

        for (Cliente cliente : listaClientes) {
            switch (cliente.IMC()) {
                case "Muito Magro":
                    categoriaMuitoMagro.add(cliente);
                    break;
                case "Normal":
                    categoriaNormal.add(cliente);
                    break;
                case "Sobre Peso":
                    categoriaSobrePeso.add(cliente);
                    break;
                case "Obeso grau 1":
                    categoriaObeso1.add(cliente);
                    break;
                case "Obeso grau 2":
                    categoriaObeso2.add(cliente);
                    break;
                case "Obeso grau 3 ou Móirbido":
                    categoriaObeso3.add(cliente);
                    break;
            }
        }
        categoriaMuitoMagro.forEach(c -> System.out.println(c) );
        categoriaNormal.forEach(c -> System.out.println(c.getNome()+","+c.IMC()) );
        categoriaSobrePeso.forEach(c -> System.out.println(c) );
        categoriaObeso1.forEach(c -> System.out.println(c) );
        categoriaObeso2.forEach(c -> System.out.println(c) );
        categoriaObeso3.forEach(c -> System.out.println(c) );
    }

    public String getDonoClinica() {
        return donoClinica;
    }

    public void setDonoClinica(String donoClinica) {
        this.donoClinica = donoClinica;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
