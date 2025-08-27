public class deCodificaDesloca implements CodificadorInterface{
    public String desCodifica(String str){
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])-1);
        }
        return(new String(resp));
    }

    @Override
    public String codifica(String str) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'codifica'");
    }
}