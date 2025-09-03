public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstance();

        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        for (String m : log) {
            System.out.println(m);
        }

        System.out.println("End of first instance \n");

        LogSimples oneAndTheSame = LogSimples.getInstance();

        oneAndTheSame.log("Mensagem de alerta 2");
        oneAndTheSame.log("Mensagem de alarme 24");
        oneAndTheSame.log("Mensagem de PANICO!!");

        for (String m : oneAndTheSame) {
            System.out.println(m);
        }
    }
}