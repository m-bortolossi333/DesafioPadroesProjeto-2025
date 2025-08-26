import java.util.List;

public class VisualizadorDeMutiplicacao implements iVisualizador{
    
    @Override
    public void atualizar(FonteDeDados fonteDeDados){
        List<Integer> valores = fonteDeDados.getValores();
        long produto = valores.stream()
            .mapToLong(Integer::longValue)
            .reduce(1, (a, b) -> a*b);
        System.out.println("Multiplicação: "+produto+", quantidade de elemento: "+valores.size());
    }
}