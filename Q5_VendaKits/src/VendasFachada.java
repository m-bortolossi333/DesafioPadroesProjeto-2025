import java.util.List;

public interface VendasFachada {

    /**
     * Cria uma nova venda e inicia o processo de venda
     *
     * @return a venda recém criada
     */
    Venda iniciarVenda();

    /**
     * Registra um novo item (produto ou kit) em uma venda
     *
     * @param umaVenda a venda atual (ainda não fechada) sendo processada
     * @param codigoProduto o código do produto/kit vendido
     * @param quantidade a quantidade vendida
     */
    void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade);

    /**
     * Emite o comprovante de venda a ser impresso
     * @param umaVenda a venda para emissão do comprovante
     * @return uma String representando o comprovante de venda a ser impresso
     */
    String emitirComprovante(Venda umaVenda);

    /**
     * Consulta a lista de itens vendáveis (produtos e kits)
     * @return a lista de itens disponíveis para venda
     */
    List<Vendavel> buscarProdutos();
}
