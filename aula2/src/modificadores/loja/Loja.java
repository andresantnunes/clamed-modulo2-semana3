package modificadores.loja;

import modificadores.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    // [modificadores.produto]
    List<Produto> produtos = new ArrayList<>();


    public Produto removeProduto(int id){
        Produto resultado = produtos.remove(id);
        return resultado;
    }

    public Boolean removeProduto(Produto produto){
        Boolean resultado = produtos.remove(produto);
        return resultado;
    }







    private String donoLoja = "Andre";

    //default
    //void não tem retorno
    void adicionaProduto(Produto produto){
        //modificadores.produto existe
        //produtos existe
        produtos.add(produto);
        printLoja();
    }

// Modificador | Tipo de Retorno | Nome | Parametros
//    public Produto removeProdutoPorId(int id){ //  Assinatura do método
//        //modificadores.produto não existe
//        //produtos existe
//        // corpo de execução do método
//        Produto resultado = produtos.remove(id);
//
//        //retorno, o mesmo tipo que o Tipo de Retorno
//        return resultado;
//    }

    private void printLoja(){
        System.out.println("Loja do "+donoLoja);
    }
}
