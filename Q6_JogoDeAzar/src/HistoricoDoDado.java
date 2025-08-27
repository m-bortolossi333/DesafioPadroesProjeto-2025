import java.util.ArrayList;
import java.util.List;

public class HistoricoDoDado extends Historico{
    private final List<Integer> historicoDado;

    public HistoricoDoDado(IDado dado){
        super(dado);
        this.historicoDado = new ArrayList<>();
        historicoDado.add(dado.getValor());
    }

    @Override
    public void rolar(){
        super.rolar();
        historicoDado.add(super.getValor());
    }

    public List<Integer> getHistorico(){
        return historicoDado;
    }
}
