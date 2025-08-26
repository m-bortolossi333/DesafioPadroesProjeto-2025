import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<iVisualizador> ivisualizador;

    public FonteDeDados(){
        this.lst = new LinkedList<>();
        this.ivisualizador = new ArrayList<>();
    }

    public void adicionaIVisualizador(iVisualizador ivs){
        if (!ivisualizador.contains(ivs)) {
            ivisualizador.add(ivs);
        }
    }

    public void removeIVisualizador(iVisualizador ivs){
        ivisualizador.remove(ivs);
    }

    public void notificar(){
        for(iVisualizador ivs :ivisualizador){
            ivs.atualizar(this);
        }
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificar();
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}