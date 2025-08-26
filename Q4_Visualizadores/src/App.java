import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia(dados.getValores());
        var cs = new VisualizadorDeSomatorio(dados.getValores());
        var cmult = new VisualizadorDeMutiplicacao(dados.getValores());

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            }
            dados.add(valor);
            cs.acrescentaValor(valor);
            cm.acrescentaValor(valor);
            cmult.acrescentaValor(valor);
            cs.exibeSomatorio();
            cm.exibeMedia();
            cmult.atualizar(dados);
        }
        System.out.println("Fim");
    }
}
