import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FonteDeDados dados = new FonteDeDados();
        iVisualizador cm = new VisualizadorDeMedia();
        iVisualizador cs = new VisualizadorDeSomatorio();
        iVisualizador cmult = new VisualizadorDeMutiplicacao();

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            }
            dados.add(valor);
            dados.adicionaIVisualizador(cs);
            dados.adicionaIVisualizador(cmult);
            dados.adicionaIVisualizador(cm);
            
        }
        System.out.println("Fim");
    }
}
