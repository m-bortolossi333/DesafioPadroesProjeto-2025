public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        var validador = new Validador();

        if (validador.valida(Validador.Tipo.EMAIL, email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }
    
        String matricula = "12345";
        if (validador.valida(Validador.Tipo.MATRICULA, matricula)) {
            System.out.println(matricula + " é uma matrícula válida!");
        } else {
            System.out.println(matricula + " não é uma matrícula válida!");
        }
    
    }
}
