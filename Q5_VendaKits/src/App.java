import java.util.List;

public class App {
    public static void main(String[] args) {
        VendasFachada proc = new VendasEmMemoria();

        // Lista de itens vendáveis (produtos e kits)
        List<Vendavel> itens = proc.buscarProdutos();

        // Exemplo: vender 1 kit e 2 borrachas
        Venda venda = proc.iniciarVenda();
        proc.registrarVenda(venda, 100, 1); // Kit "Volta às Aulas" (id 100)
        proc.registrarVenda(venda, 2, 2);   // Borracha (id 2)

        System.out.println(proc.emitirComprovante(venda));
    }
}
