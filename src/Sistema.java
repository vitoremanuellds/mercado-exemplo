import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {

		Produto produtoLeite = new Produto("Leite em pó", "Parmalat");
		Lote lote = new Lote(produtoLeite, 10L);
		ProdutoRepository catalogo = new ProdutoRepository();

		Produto produtoPao = new Produto("Pao", "Francês");
		Produto produtoLeiteCaixa = new Produto("Leite de caixa", "Piracanjuba");
		Produto produtoSuco = new Produto("Suco", "Árvore");
		Produto produtoOvoCodorna = new Produto("Ovo de Codorna", "Codorna");
		Produto produtoPaoDoce = new Produto("Pão Doce", "Padaria");
		
		catalogo.addProduto(produtoLeite);
		catalogo.addProduto(produtoPao);
		catalogo.addProduto(produtoOvoCodorna);
		catalogo.addProduto(produtoPaoDoce);
		catalogo.addProduto(produtoLeiteCaixa);
		catalogo.addProduto(produtoSuco);


		System.out.println(catalogo);
		System.out.println(lote);

		// catalogo.removeProduto(produtoLeite.getId());

		for (Produto produto : catalogo.listProdutos()) {
			System.out.println(produto);
		}

		System.out.println(catalogo); */
	}
}
