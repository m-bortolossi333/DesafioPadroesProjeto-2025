import java.util.List;

public class VisualizadorDeSomatorio implements iVisualizador{
    
    public void atualizar(FonteDeDados fonteDeDados){
        List<Integer> valores = fonteDeDados.getValores();
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+valores.size());
    }
}
