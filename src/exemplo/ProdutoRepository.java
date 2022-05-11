package exemplo;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {

    private Map<String, Produto> catalogo;

    public ProdutoRepository() {
         this.catalogo = new HashMap();
    }

    public String addProduto(Produto p) {
        this.catalogo.put(p.getId(), p);
        return p.getId();
    }

    public void removeProduto(String id) {
        this.catalogo.remove(id);
    }

    public Produto searchProduto(String id) {
        return this.catalogo.get(id);
    }

    public void updateProduto(String id, String fabricante) {
        Produto p = this.searchProduto(id);
        p.setFabricante(fabricante);
        this.addProduto(p);
    }

    public String toString() {
        String result = new String();
        for (Produto produto : this.catalogo.values() ) {
            result += "(" + produto.toString() + ") ";
        }
        return result;
    }

}
