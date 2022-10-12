package modificadores.loja;

import modificadores.produto.Produto;

public class MainLoja {
    public static void main(String[] args) {
        Loja lojaObjeto = new Loja();
        // lojaObjeto.adicionaProduto(modificadores.produto)
        // lojaObjeto.removeProduto(id)
        System.out.println(lojaObjeto.produtos);
        //                          modificadores.produto
        lojaObjeto.adicionaProduto(new Produto());

        Produto pastaProduto = new Produto();
        pastaProduto.nome = "Pasta de Dente";
        lojaObjeto.adicionaProduto(pastaProduto);
        System.out.println(lojaObjeto.produtos);

        lojaObjeto.removeProdutoPorId(0);
        System.out.println(lojaObjeto.produtos);

    }
}
