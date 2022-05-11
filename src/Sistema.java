import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produtoLeite = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(produtoLeite, 10L);
		ProdutoRepository catalogo = new ProdutoRepository();

		Produto produtoPao = new Produto("Pao", "Francês");
		Produto produtoOvo = new Produto("Ovo", "Galinha");

		catalogo.addProduto(produtoLeite);
		catalogo.addProduto(produtoPao);
		catalogo.addProduto(produtoOvo);

		System.out.println(catalogo);
		System.out.println(lote);

		catalogo.removeProduto(produtoLeite.getId());

		System.out.println(catalogo);
	}
}
