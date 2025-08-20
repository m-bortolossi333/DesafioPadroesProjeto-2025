import java.util.HashMap;
import java.util.Map;

public class Validador {

    public enum Tipo { EMAIL, INTEIRO, MATRICULA }

    private final Map<Tipo, ValidadorStrategy> estrategias = new HashMap<>();

    public Validador() {
        estrategias.put(Tipo.EMAIL, new EmailValidador());
        estrategias.put(Tipo.INTEIRO, new InteiroValidador());
        estrategias.put(Tipo.MATRICULA, new MatriculaValidador());
    }

    public boolean valida(Tipo tipo, String valor) {
        ValidadorStrategy estrategia = estrategias.get(tipo);
        if (estrategia == null) return false;
        return estrategia.valida(valor);
    }
}
