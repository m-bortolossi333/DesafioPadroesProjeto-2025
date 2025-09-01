import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kit implements Vendavel {
    private int id;
    private String nome;
    private final List<Vendavel> itens;

    public Kit(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionar(Vendavel item) {
        itens.add(item);
    }

    public void remover(Vendavel item) {
        itens.remove(item);
    }

    public List<Vendavel> getItens() {
        return Collections.unmodifiableList(itens);
    }

    private double getPrecoBruto() {
        double soma = 0.0;
        for (Vendavel v : itens) {
            soma += v.getPreco();
        }
        return soma;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    /**
     * Preço do kit = soma dos preços dos itens com 10% de desconto
     */
    @Override
    public double getPreco() {
        return getPrecoBruto() * 0.90;
    }
}
