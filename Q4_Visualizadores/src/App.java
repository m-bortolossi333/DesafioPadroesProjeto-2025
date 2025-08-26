import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FonteDeDados dados = new FonteDeDados();
        iVisualizador cm = new VisualizadorDeMedia();
        iVisualizador cs = new VisualizadorDeSomatorio();
        iVisualizador cmult = new VisualizadorDeMutiplicacao();

        Scanner s = new Scanner(System.in);
        int valor = 0;

        System.out.println("------------------------------------------------------");
        System.out.println("Selecione a opção desejeda");
        System.out.println("Opção -1 Visualizar o Somatorio");
        System.out.println("Opção -2 Visualizar a media");
        System.out.println("Opção -3 Visualizar a Multiplicacao");
        System.out.println("Opção 0 Sair");
        System.out.println("------------------------------------------------------");

        System.out.println("OBS: Selecione a opção primeiro antes do valor");

        while (true) {
            System.out.println("\nEntre um valor positivo, se deseja sair digite 0):");
            try {
                valor = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Por favor, digite um numero.");
                continue;
            }

            if (valor == 0) {
                break;
            } else if (valor > 0) {
                System.out.println("--- DADOS ATUALIZADOS ---");
                dados.add(valor); // A fonte de dados notifica os observadores ATIVOS
            } else {
                // Comandos para ligar os observadores
                switch (valor) {
                    case -1:
                        dados.adicionaIVisualizador(cs);
                        System.out.println("=> Visualizador de SOMATORIO ativado.");
                        break;
                    case -2:
                        dados.adicionaIVisualizador(cm);
                        System.out.println("=> Visualizador de MEDIA ativado.");
                        break;
                    case -3:
                        dados.adicionaIVisualizador(cmult);
                        System.out.println("=> Visualizador de MULTIPLICACAO ativado.");
                        break;
                    default:
                        System.out.println("Comando desconhecido.");
                        break;
                }
            }
        }
        s.close();
        System.out.println("Fim do programa.");
    }

}
