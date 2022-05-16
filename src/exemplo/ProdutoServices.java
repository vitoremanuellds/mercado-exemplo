package exemplo;

import java.util.LinkedList;
import java.util.List;

public class ProdutoServices {

    private LoteRepository lotes;
    private ProdutoRepository catalogo;

    public ProdutoServices() {
        this.lotes = new LoteRepository();
    }

    public List<Produto> listProdutosWithLote(String name) {
        List<Lote> availableLotes = this.lotes.listLotes();

        List<Produto> produtosFromLotes = this.getProdutosFromLotes(availableLotes);
        return this.getProdutosByName(name, produtosFromLotes);
    }

    private List<Produto> getProdutosFromLotes(List<Lote> availableLotes) {
        List<Produto> produtos = new LinkedList<>();
        for (Lote lote : availableLotes) { produtos.add(lote.getProduto()); }
        return produtos;
    }

    private List<Produto> getProdutosByName(String name, List<Produto> produtos) {
        List<Produto> result = new LinkedList<>();
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(name.toLowerCase().trim())) {
                result.add(produto);
            }
        }
        return result;
    }

    public List<Produto> listProdutosByName(String name) {
        List<Produto> produtos = this.catalogo.listProdutos();
        return this.getProdutosByName(name, produtos);
    }

}
