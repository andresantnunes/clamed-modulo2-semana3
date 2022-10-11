import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    String nome;
    List<Produto> listaProdutosVendidos =new ArrayList<>();

    public void adicionaProdutoVendido(Produto produto){
        this.listaProdutosVendidos.add(produto);
    }
}
