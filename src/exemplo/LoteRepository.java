package exemplo;

import java.util.*;

public class LoteRepository {

    private Map<String, Lote> lotes;

    public LoteRepository() {
        this.lotes = new HashMap<String, Lote>();
    }

    public String addLote(Lote lote) {
        this.lotes.put(lote.getId(), lote);
        return lote.getId();
    }

    public void removeLote(String id) {
        this.lotes.remove(id);
    }

    public Lote searchLote(String id) {
        return this.lotes.get(id);
    }

    public void updateLote(String id, Long newQtd, Date newDataFabricacao, Date newDataValidade) {
        Lote lote = this.searchLote(id);

        lote.setQuantidade(newQtd);
        lote.setDataFabricacao(newDataFabricacao);
        lote.setDataValidade(newDataValidade);

        this.addLote(lote);
    }

    public List<Lote> listLotes() {
        return new LinkedList<Lote>(this.lotes.values());
    }

    public String toString() {
        String result = new String();
        for (Lote lote : this.lotes.values() ) {
            result += "(" + lote.toString() + ") ";
        }
        return result;
    }
}
