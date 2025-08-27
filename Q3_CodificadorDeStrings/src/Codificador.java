public class Codificador {
    private CodificadorInterface estrategia;

    public void setEstrategia(CodificadorInterface estrategia) {
        this.estrategia = estrategia;
    }

    public String codificar(String str) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia não definida");
        }
        return estrategia.codifica(str);
    }

    public String desCodificar(String str) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia não definida");
        }
        return estrategia.desCodifica(str);
    }
}