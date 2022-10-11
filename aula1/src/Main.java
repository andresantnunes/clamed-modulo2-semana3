public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Sabão suvaqueira";

        Produto produto2 = new Produto();
        produto2.nome = "Desodorante bafo-de-cobra";

        Vendedor vendedor = new Vendedor();
        vendedor.nome ="Silas";

        vendedor.adicionaProdutoVendido(produto);
        vendedor.adicionaProdutoVendido(produto2);

        System.out.println(vendedor.listaProdutosVendidos);
        vendedor.listaProdutosVendidos.forEach(
                produto1 -> System.out.println(produto1.nome)
        );
    }
}
