import java.util.List;

public class VisualizadorDeMedia implements iVisualizador {
   
    public void atualizar(FonteDeDados fonteDeDados){
        List<Integer> valores = fonteDeDados.getValores();
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+valores.size());
    }
}
