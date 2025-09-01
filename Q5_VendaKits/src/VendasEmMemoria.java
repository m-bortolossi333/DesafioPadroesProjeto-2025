import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada {
    private List<Vendavel> produtos;

    public VendasEmMemoria() {
        produtos = new ArrayList<>();

        // Produtos simples (folhas)
        Produto caneta = new Produto(1, "Caneta", 1.55);
        Produto borracha = new Produto(2, "Borracha", 1.15);
        Produto caderno = new Produto(3, "Caderno", 32.99);

        produtos.add(caneta);
        produtos.add(borracha);
        produtos.add(caderno);

        // Kit (composto) com 10% de desconto sobre a soma
        Kit kitVoltaAsAulas = new Kit(100, "Kit Volta às Aulas");
        kitVoltaAsAulas.adicionar(caneta);
        kitVoltaAsAulas.adicionar(borracha);
        kitVoltaAsAulas.adicionar(caderno);

        produtos.add(kitVoltaAsAulas);
    }

    @Override
    public Venda iniciarVenda() {
        return new Venda(LocalDateTime.now());
    }

    @Override
    public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
        Vendavel vendavel = produtos.stream()
                .filter(p -> p.getId() == codigoProduto)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Código inexistente: " + codigoProduto));
        umaVenda.registrarVenda(vendavel, quantidade);
    }

    @Override
    public String emitirComprovante(Venda umaVenda) {
        return umaVenda.emitirComprovante();
    }

    @Override
    public List<Vendavel> buscarProdutos() {
        return Collections.unmodifiableList(produtos);
    }
}
