public class App {
    public static void main(String[] args) {
        Codificador codificador = new Codificador();
        String textoOriginal = "Desafio Padrões de Projeto";

        // Usando estratégia de codificação simples
        codificador.setEstrategia(new CodificaSimples());
        String codificado = codificador.codificar(textoOriginal);
        String decodificado = codificador.desCodificar(codificado);
        
        System.out.println("Original: " + textoOriginal);
        System.out.println("Codificado (Simples): " + codificado);
        System.out.println("Decodificado (Simples): " + decodificado);
        System.out.println();

        // Usando estratégia de deslocamento
        codificador.setEstrategia(new CodificaDesloca());
        codificado = codificador.codificar(textoOriginal);
        decodificado = codificador.desCodificar(codificado);
        
        System.out.println("Original: " + textoOriginal);
        System.out.println("Codificado (Deslocamento): " + codificado);
        System.out.println("Decodificado (Deslocamento): " + decodificado);
    }
}
