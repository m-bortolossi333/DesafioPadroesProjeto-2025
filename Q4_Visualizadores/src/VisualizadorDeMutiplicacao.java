import java.util.List;

public class VisualizadorDeMutiplicacao {
    private List<Integer> valores;
    
    public VisualizadorDeMutiplicacao(List<Integer> valores){
        this.valores = valores;
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    public void acrescentaValor(Integer valor){
        this.valores.add(valor);
    }

    public void exibeMultiplicacao(){
        System.out.println("");
    }
}