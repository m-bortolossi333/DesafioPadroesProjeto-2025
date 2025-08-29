import java.util.List;

public class App {
    public static void main(String[] args) {
        IDado d6 = new Dado(6);
       
        HistoricoDoDado historicoD6 = new HistoricoDoDado(d6);

        System.out.println("Lançando o dado D6");

        historicoD6.rolar();
        historicoD6.rolar();
      
        System.out.println("Ultimo valor do Dado de 6: "+historicoD6.getValor());
        System.out.println("Historico do Dado D6: "+historicoD6.getHistorico()+"\n");

        System.out.println("Exemplo com Dado de D20");

        HistoricoDoDado d20 =new HistoricoDoDado(new Dado(20));
        
        d20.rolar();
        d20.rolar();
        
        System.out.println("Ultimo valor do Dado de 20: "+d20.getValor());
        System.out.println("Historico do Dado D20: "+d20.getHistorico());

    }
}