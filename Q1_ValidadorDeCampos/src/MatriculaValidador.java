public class MatriculaValidador implements ValidadorStrategy {
    private final InteiroValidador inteiroValidador = new InteiroValidador();

    @Override
    public boolean valida(String valor) {
        return inteiroValidador.valida(valor);
    }
}
