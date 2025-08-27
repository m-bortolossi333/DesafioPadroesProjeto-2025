public class App {
    public static void main(String[] args) {
        IDado d6 = new Dado(6);
       
        HistoricoDoDado historicoD6 = new HistoricoDoDado(d6);
        d6.rolar();
        d20.rolar();
        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());


    }
}