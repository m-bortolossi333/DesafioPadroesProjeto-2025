public abstract class Historico implements IDado{
    private IDado historico;

    public Historico(IDado dado){
        this.historico = dado;
    }

    @Override
    public void rolar(){
        historico.rolar();
    }

    @Override
    public int getValor(){
        return historico.getValor();
    }
}