package exemplo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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

    public List<Produto> listProduto(String name) {
        List<Produto> result = new LinkedList<>();

        for (Produto produto : this.catalogo.values()) {
            if (produto.getNome().toLowerCase().contains(name.toLowerCase().trim())) {
                result.add(produto);
            }
        }

        return result;
    }

    public String toString() {
        String result = new String();
        for (Produto produto : this.catalogo.values() ) {
            result += "(" + produto.toString() + ") ";
        }
        return result;
    }

}
